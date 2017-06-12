import sys
import os
import subprocess
from multiprocessing import Process
import csv
from collections import defaultdict
from pprint import pprint
import random
import time


class TestGenerator(object):

    def __init__(self, testclasses):
        self.tool = ""
        self.testclasses = testclasses
        self.suffix = ""
        self.folder_suffix = ""

    HEADERS_JACOCO_COVERAGE = [
        "INSTRUCTION_MISSED",
        "INSTRUCTION_COVERED",
        "BRANCH_MISSED",
        "BRANCH_COVERED",
        "LINE_MISSED",
        "LINE_COVERED",
        "COMPLEXITY_MISSED",
        "COMPLEXITY_COVERED",
        "METHOD_MISSED",
        "METHOD_COVERED",
    ]

    STATUS_MUTATIONS = [
        "KILLED",
        "SURVIVED",
        "NO_COVERAGE"
    ]

    def genFolders(self, path):
        exec_command = ""
        if sys.platform != 'win32':
            exec_command += "mkdir -p "
        else:
            exec_command = "cmd /c mkdir "
        subprocess.run(exec_command + path)

    def deleteFolder(self, path):
        exec_command = ""
        if sys.platform != 'win32':
            exec_command += "rm -rf "
        else:
            exec_command = "cmd /c rmdir /S /Q "
        print(exec_command + path)
        subprocess.run(exec_command + path)

    def deleteTestFolders(self):
        self.deleteFolder("tests")

    def deleteReportsFolders(self):
        self.deleteFolder("reports")

    def getResultsCsvCoverage(self, t, n):
        results = {}
        testSuiteName = self.generateTestSuiteName(t, n)
        csv_filename = os.path.join(
            self.getReportPath(), testSuiteName) + ".csv"
        with open(csv_filename, "r") as coverage_results:
            for row in csv.DictReader(coverage_results):
                for h in TestGenerator.HEADERS_JACOCO_COVERAGE:
                    results.setdefault(h, 0)
                    results[h] = int(row[h])
        return results

    def getResultsMutations(self, t, n):
        resultsMutation = {
            status: 0 for status in TestGenerator.STATUS_MUTATIONS
        }
        csv_filename = os.path.join(
            self.getMutationsReportPath(t, n), "mutations.csv")
        with open(csv_filename, "r") as mutation_results:
            reader = csv.reader(mutation_results)
            for row in reader:
                for status in TestGenerator.STATUS_MUTATIONS:
                    if status in row:
                        resultsMutation[status] += 1
        return resultsMutation

    def genTestCommand(self, t, testSuiteNumber):
        raise NotImplementedError

    def compileTestCommand(self, testclass):
        src = os.path.join(self.getSrcPath(), *self.getPackage(testclass))
        bin_ = self.getBinPath()
        classpath = os.pathsep.join(
            [".", os.path.join("jars", "*"), bin_, "bin"]
        )
        to_compile = os.path.join(src, "*.java")
        command = "javac -cp {classpath} {to_compile} -d {bin}".format(
            **{
                "classpath": classpath,
                "to_compile": to_compile,
                "bin": bin_
            }
        )
        print(command)
        return command

    def mutationTestCommand(self, testclass, testSuite):
        classpath_folders = [
            "bin", self.getBinPath(), os.path.join("jars", "*")]
        classpath = os.pathsep.join(classpath_folders)
        pit_classpath = ",".join(classpath_folders)
        src_dirs = ["src", self.getSrcPath()]
        pitest = "org.pitest.mutationtest.commandline.MutationCoverageReport"
        options = " ".join([
            "--reportDir {0}".format(
                self.getMutationsReportPath(testclass, testSuite)),
            "--targetClasses {0}".format(testclass),
            "--targetTests {0}".format(
                self.generateTestSuiteName(testclass, testSuite)),
            "--sourceDirs {dirs}".format(
                **{
                    "dirs": ",".join(src_dirs)
                }
            ),
            "--outputFormats CSV",
            "--timestampedReports=false"
        ])
        command = "java -cp {classpath}  {pitest} {options}".format(
            **{
                "classpath": classpath,
                "pitest": pitest,
                "options": options,
            }
        )
        print(command)
        return command

    def runTestCommands(self, testclass, testSuite=""):
        jars = os.path.join("jars", "*")
        testSuiteName = self.generateTestSuiteName(testclass, testSuite)
        classpath = os.pathsep.join([".", "bin", self.getBinPath(), jars])
        jacoco = "{jar}=destfile={report_out}.exec".format(
            **{
                "jar": os.path.join("jars", "jacocoagent.jar"),
                "report_out": os.path.join(self.getReportPath(), testSuiteName),
            }
        )
        command = "java -cp {classpath} -javaagent:{jacoco} org.junit.runner.JUnitCore {classname}".format(
            **{
                "classpath": classpath,
                "jacoco": jacoco,
                "classname": testSuiteName
            }
        )
        print(command)
        return command

    def genReportCommand(self, testclass, testSuite=""):
        testSuiteName = self.generateTestSuiteName(testclass, testSuite)
        report_file_name = os.path.join(
            self.getReportPath(), testSuiteName
        )
        exec_file = report_file_name + ".exec"
        csv_file = report_file_name + ".csv"

        jacococli = os.path.join("jars", "jacococli.jar")
        classfiles = os.path.join(
            "bin", testclass.replace(".", os.path.sep)) + ".class"
        command = "java -jar {jacococli} report {exec_file} --classfiles {classfiles} --csv {csv_file} --name {tool}".format(
            **{
                "jacococli": jacococli,
                "exec_file": exec_file,
                "classfiles": classfiles,
                "csv_file": csv_file,
                "tool": self.tool
            }
        )
        print(command)
        return command

    def executeCommands(self, commands):
        processes = [Process(target=subprocess.run, args=(c,))
                     for c in commands]
        if len(processes) < 5:
            for p in processes:
                p.start()
            for p in processes:
                p.join()
        else:
            pieces = len(processes) // 4
            for x in range(pieces):
                for i in range(4):
                    processes[x * 4 + i].start()
                for i in range(4):
                    processes[x * 4 + i].join()

            remaining = len(processes) % 4
            if remaining > 0:
                for i in range(remaining):
                    processes[pieces * 4 + i].start()
                for i in range(remaining):
                    processes[pieces * 4 + i].join()

    def generateReportsFolders(self, testSuites):
        self.genFolders(self.getBinPath())
        self.genFolders(self.getReportPath())
        for t in self.testclasses:
            for n in range(testSuites):
                self.genFolders(self.getMutationsReportPath(t, str(n)))

    def generateTestSuites(self, numberOfTestSuites):
        generate_tests_commands = [self.genTestCommand(t, n) for t in self.testclasses
                                   for n in range(numberOfTestSuites)]
        self.executeCommands(generate_tests_commands)

    def run(self, testSuites):
        self.generateReportsFolders(testSuites)
        results = {t: defaultdict(float) for t in self.testclasses}

        compile_commands = [self.compileTestCommand(t)
                            for t in self.testclasses]
        run_commands = [self.runTestCommands(t, n)
                        for t in self.testclasses
                        for n in range(testSuites)]
        gen_reports_commands = [self.genReportCommand(t, n)
                                for t in self.testclasses
                                for n in range(testSuites)]
        mutation_commands = [self.mutationTestCommand(t, str(n))
                             for t in self.testclasses
                             for n in range(testSuites)]

        self.executeCommands(compile_commands)
        self.executeCommands(mutation_commands)
        self.executeCommands(run_commands)
        self.executeCommands(gen_reports_commands)

        for t in self.testclasses:
            for n in range(testSuites):
                coverage = self.getResultsCsvCoverage(t, str(n))
                mutations = self.getResultsMutations(t, str(n))

                line_coverage = self.getLineCoveragePercentage(coverage)
                branch_coverage = self.getBranchCoveragePercentage(coverage)
                mutation_score = self.getMutationScorePercentage(mutations)

                self.writeOutputToCsv({
                    "class": t,
                    "tool": self.tool,
                    "line_coverage_%": line_coverage,
                    "branch_coverage_%": branch_coverage,
                    "mutation_score_%": mutation_score
                })

                results[t]["LINE_COVERAGE"] += line_coverage
                results[t]["BRANCH_COVERAGE"] += branch_coverage
                results[t]["MUTATION_SCORE"] += mutation_score

        for t in self.testclasses:
            results[t]["LINE_COVERAGE"] /= float(testSuites)
            results[t]["BRANCH_COVERAGE"] /= float(testSuites)
            results[t]["MUTATION_SCORE"] /= float(testSuites)
        return results

    def writeOutputToCsv(self, results_run):
        with open('results.csv', 'a') as csvfile:
            header = ["class", "tool", "line_coverage_%",
                      "branch_coverage_%", "mutation_score_%"]
            writer = csv.DictWriter(csvfile, fieldnames=header)
            writer.writerow(results_run)

    def getLineCoveragePercentage(self, results):
        covered_lines = results['LINE_COVERED']
        total_lines = covered_lines + results['LINE_MISSED']
        return covered_lines / total_lines

    def getBranchCoveragePercentage(self, results):
        covered_branches = results['BRANCH_COVERED']
        total_branches = covered_branches + results['BRANCH_MISSED']
        return covered_branches / total_branches

    def getMutationScorePercentage(self, results):
        total_mutants = sum((results[s]
                             for s in TestGenerator.STATUS_MUTATIONS))
        return results["KILLED"] / total_mutants

    def getSrcPath(self):
        return os.path.join("tests", self.tool, "src", self.folder_suffix)

    def getBinPath(self):
        return os.path.join("tests", self.tool, "bin")

    def getPackage(self, testclass):
        return filter(lambda s: s[0] >= 'a', testclass.split("."))

    def getClassName(self, testclass):
        return testclass.split(".")[-1]

    def getReportPath(self):
        return os.path.join("reports", self.tool)

    def getMutationsReportPath(self, testclass, testSuite):
        return os.path.join(self.getReportPath(), "mutationReport", testclass, testSuite)

    def generateTestSuiteName(self, testclass, testSuiteNumber):
        return "".join([testclass, str(testSuiteNumber), self.suffix])


class RandoopTestGenerator(TestGenerator):

    def __init__(self, testclasses):
        super(RandoopTestGenerator, self).__init__(testclasses)
        self.tool = "Randoop"
        self.suffix = "_Test"
        self.genFolders(self.getSrcPath())

    def genTestCommand(self, testclass, testSuiteNumber):
        classpath = os.pathsep.join(
            [os.path.join("jars", "*"), "bin"]
        )
        random.seed(int(time.time() * 10))
        randoop = "randoop.main.Main gentests"
        options = " ".join([
            "--no-error-revealing-tests=true",
            "--timelimit=60",
            "--regression-test-basename={testclass}".format(
                **{
                    "testclass": self.generateTestSuiteName(self.getClassName(testclass), testSuiteNumber)
                }
            ),
            "--junit-package-name={package}".format(
                **{
                    "package": ".".join(self.getPackage(testclass))
                }
            ),
            "--classlist=classlist_randoop.txt",
            "--randomseed={0}".format(int(random.random() * 1000))
        ])
        command = "java -ea -classpath {classpath} {randoop} --testclass={testclass} {options} --junit-output-dir={output_dir}".format(
            **{
                "classpath": classpath,
                "randoop": randoop,
                "testclass": testclass,
                "options": options,
                "output_dir": os.path.join("tests", self.tool, "src")
            }
        )
        print(command)
        return command


class EvoTestGenerator(TestGenerator):

    def __init__(self, testclasses):
        super(EvoTestGenerator, self).__init__(testclasses)
        self.tool = "EvoSuite"
        self.suffix = "_ESTest"
        self.folder_suffix = "evosuite-tests"
        self.genFolders(self.getSrcPath())

    def genTestCommand(self, testclass, testSuiteNumber):
        jars = os.path.join("jars", "evosuite-master-1.0.5.jar")
        classpath = os.path.abspath("bin")
        options = " ".join([
            "-generateSuite",
            "-Dsearch_budget=60",
            "-Dstopping_condition=MaxTime",
            "-Duse_separate_classloader=false",
            "-Dsave_all_data=false",
            "-Djunit_suffix={0}{1}".format(testSuiteNumber, self.suffix)
        ])
        command = "java -ea -jar {jars} -projectCP {classpath} {options} -class {testclass} -base_dir {output_dir}".format(
            **{
                "jars": jars,
                "classpath": classpath,
                "options": options,
                "testclass": testclass,
                "output_dir": os.path.join("tests", self.tool, "src")
                # solo para este caso dejar asi!
            }
        )
        print(command)
        return command


# lo deberia levantar de un txt?
testclasses = [
    "collections.comparators.FixedOrderComparator",
    "collections.iterators.FilterIterator",
    "collections.map.PredicatedMap",
    "math.genetics.ElitisticListPopulation",
]


def print_results(results):
    print("\t\tAverage Line Coverage\t\tAverage Branch Coverage\t\tAverage Mutation Score")
    print("Class\t\tRandoop Evosuite\t\tRandoop Evosuite\t\tRandoop Evosuite\t\t")
    for t in testclasses:
        print("{classname}\t\t{r_line} {e_line}\t\t{r_branch} {e_branch}\t\t{r_mutation} {e_mutation}\t\t".format(
            **{
                "classname": t,
                "r_line": results['Randoop'][t]["LINE_COVERAGE"],
                "e_line": results['EvoSuite'][t]["LINE_COVERAGE"],
                "r_branch": results["Randoop"][t]["BRANCH_COVERAGE"],
                "e_branch": results["EvoSuite"][t]["BRANCH_COVERAGE"],
                "r_mutation": results["Randoop"][t]["MUTATION_SCORE"],
                "e_mutation": results["EvoSuite"][t]["MUTATION_SCORE"]
            }
        ))


if __name__ == '__main__':

    exec_command = ""
    if sys.platform != 'win32':
        exec_command += "rm "
    else:
        exec_command = "cmd /c del"
    subprocess.run(exec_command + " results.csv")

    test_suites = 30
    generate = False
    generators = [RandoopTestGenerator(testclasses),
                  EvoTestGenerator(testclasses)]

    # generate tests
    if generate:
        for g in generators:
            g.generateTestSuites(test_suites)

    results = {}

    for g in generators:
        results[g.tool] = g.run(test_suites)

    print_results(results)
