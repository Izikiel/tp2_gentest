import sys
import os
import subprocess
from multiprocessing import Process
import csv
from pprint import pprint


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

    def genFolders(self, path):
        exec_command = ""
        if sys.platform != 'win32':
            exec_command += "mkdir -p "
        else:
            exec_command = "cmd /c mkdir "
        subprocess.run(exec_command + path)

    def updateResultsCsv(self, csv_filename, results):
        with open(csv_filename, "r") as coverage_results:
            for row in csv.DictReader(coverage_results):
                class_name = row["PACKAGE"] + "." + row["CLASS"]
                results.setdefault(class_name, {})

                for h in TestGenerator.HEADERS_JACOCO_COVERAGE:
                    results[class_name].setdefault(h, 0)
                    results[class_name][h] += int(row[h])
        return results

    def genTestCommand(self, t):
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

    def mutationTestCommand(self, testclass):
        classpath_folders = ["bin", self.getBinPath(), os.path.join("jars", "*")]
        classpath = os.pathsep.join(classpath_folders)
        pit_classpath = ",".join(classpath_folders)
        src_dirs =  ["src", self.getSrcPath()]
        pitest = "org.pitest.mutationtest.commandline.MutationCoverageReport"
        star_classes = ".".join([*self.getPackage(testclass), "*"])
        options = " ".join([
            "--reportDir {0}".format(self.getReportPath()),
            "--targetClasses {0}".format(testclass),
            "--targetTests {0}".format(testclass + self.suffix),
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

    def runTestCommands(self, testclass):
        jars = os.path.join("jars", "*")
        classpath = os.pathsep.join([".", "bin", self.getBinPath(), jars])
        jacoco = "{jar}=destfile={report_out}.exec".format(
            **{
                "jar": os.path.join("jars", "jacocoagent.jar"),
                "report_out": os.path.join(self.getReportPath(), testclass),
            }
        )
        command = "java -cp {classpath} -javaagent:{jacoco} org.junit.runner.JUnitCore {classname}".format(
            **{
                "classpath": classpath,
                "jacoco": jacoco,
                "classname": testclass + self.suffix
            }
        )
        print(command)
        return command

    def genReportCommand(self, testclass):
        report_file_name = os.path.join(self.getReportPath(), testclass)
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

    def run(self, times):

        def executeCommands(commands):
            processes = [Process(target=subprocess.run, args=(c,))
                         for c in commands]
            for p in processes:
                p.start()
            for p in processes:
                p.join()

        results = {
        }
        self.genFolders(self.getSrcPath())
        self.genFolders(self.getBinPath())
        self.genFolders(self.getReportPath())
        self.genFolders(self.getMutationsReportPath())

        generate_tests_commands = map(self.genTestCommand, self.testclasses)
        compile_commands = map(self.compileTestCommand, self.testclasses)
        run_commands = map(self.runTestCommands, self.testclasses)
        gen_reports_commands = map(self.genReportCommand, self.testclasses)
        mutation_commands = map(self.mutationTestCommand, self.testclasses)

        for _ in range(times):
            executeCommands(generate_tests_commands)
            executeCommands(compile_commands)
            executeCommands(mutation_commands)
            executeCommands(run_commands)
            executeCommands(gen_reports_commands)

            for t in self.testclasses:
                csv_filename = os.path.join(self.getReportPath(), t) + ".csv"
                self.updateResultsCsv(csv_filename, results)

        for t in self.testclasses:
            for h in TestGenerator.HEADERS_JACOCO_COVERAGE:
                results[t][h] /= float(times)

        return results

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

    def getMutationsReportPath(self):
        return os.path.join(self.getReportPath(), "mutationReport")


class RandoopTestGenerator(TestGenerator):

    def __init__(self, testclasses):
        super(RandoopTestGenerator, self).__init__(testclasses)
        self.tool = "randoop"
        self.suffix = "_Test"

    def genTestCommand(self, testclass):
        classpath = os.pathsep.join(
            [os.path.join("jars", "*"), "bin"]
        )
        randoop = "randoop.main.Main gentests"
        options = " ".join([
            "--no-error-revealing-tests=true",
            "--timelimit=60",
            "--regression-test-basename={testclass}".format(
                **{
                    "testclass": self.getClassName(testclass) + self.suffix
                }
            ),
            "--junit-package-name={package}".format(
                **{
                    "package": ".".join(self.getPackage(testclass))
                }
            )
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
        self.tool = "evo"
        self.suffix = "_ESTest"
        self.folder_suffix = "evosuite-tests"

    def genTestCommand(self, testclass):
        jars = os.path.join("jars", "evosuite-master-1.0.5.jar")
        classpath = os.path.abspath("bin")
        options = " ".join([
            "-generateSuite",
            "-Dsearch_budget=60",
            "-Dstopping_condition=MaxTime",
            "-Duse_separate_classloader=false",
            "-Dsave_all_data=false"
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
    # "collections.iterators.FilterIterator",
    # "collections.map.PredicatedMap",
    # "math.genetics.ElitisticListPopulation",
]

if __name__ == '__main__':
    r = RandoopTestGenerator(testclasses)
    pprint(r.run(1))

    # evo = EvoTestGenerator(testclasses)
    # pprint(evo.run(1))
