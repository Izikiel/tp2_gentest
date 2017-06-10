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

    def compileCommands(self, src, bin_):
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

    def genCommand(self, t):
        raise NotImplementedError

    def genTestsCommands(self):
        commands = []
        for t in self.testclasses:
            self.genFolders(self.getSrcPath(t))
            commands.append(self.genCommand(t))
        return commands

    def runMutationTestCommandGenerator(self, src, bin_, report, testclass):
        jars = os.path.join("jars", "*")
        classpath = os.pathsep.join([".", "bin", bin_, jars])
        pitest = ""

    def genReportCommand(self):
        commands = []
        for t in self.testclasses:
            report_file_name = os.path.join(self.getReportPath(), t)
            exec_file = report_file_name + ".exec"
            csv_file = report_file_name + ".csv"

            jacococli = os.path.join("jars", "jacococli.jar")
            classfiles = os.path.join(
                "bin", t.replace(".", os.path.sep)) + ".class"
            command = "java -jar {jacococli} report {exec_file} --classfiles {classfiles} --csv {csv_file} --name {tool}".format(
                **{
                    "jacococli": jacococli,
                    "exec_file": exec_file,
                    "classfiles": classfiles,
                    "csv_file": csv_file,
                    "tool": self.tool
                }
            )
            commands.append(command)
        return commands

    def runCommands(self, commands):
        processes = [Process(target=subprocess.run, args=(c,))
                     for c in commands]
        for p in processes:
            p.start()
        for p in processes:
            p.join()

    def updateResultsCsv(self, csv_filename, results):
        with open(csv_filename, "r") as coverage_results:
            for row in csv.DictReader(coverage_results):
                class_name = row["PACKAGE"] + "." + row["CLASS"]
                results.setdefault(class_name, {})

                for h in TestGenerator.HEADERS_JACOCO_COVERAGE:
                    results[class_name].setdefault(h, 0)
                    results[class_name][h] += int(row[h])
        return results

    def run(self, times):
        # falta mutaciones
        results = {
        }
        for _ in range(times):
            self.runCommands(self.genTestsCommands())
            self.runCommands(self.compileTestsCommands())
            self.runCommands(self.runTestsCommands())
            self.runCommands(self.genReportCommand())

            for t in self.testclasses:
                csv_filename = os.path.join(self.getReportPath(), t) + ".csv"
                self.updateResultsCsv(csv_filename, results)

        for t in self.testclasses:
            for h in TestGenerator.HEADERS_JACOCO_COVERAGE:
                results[t][h] /= float(times)

        return results

    def runTestsCommands(self):
        commands = []
        for t in self.testclasses:
            bin_ = self.getBinPath()
            self.genFolders(self.getReportPath())
            jars = os.path.join("jars", "*")
            classpath = os.pathsep.join([".", "bin", bin_, jars])
            jacoco = "{jar}=destfile={report_out}.exec".format(
                **{
                    "jar": os.path.join("jars", "jacocoagent.jar"),
                    "report_out": os.path.join(self.getReportPath(), t),
                }
            )
            command = "java -cp {classpath} -javaagent:{jacoco} org.junit.runner.JUnitCore {classname}".format(
                **{
                    "classpath": classpath,
                    "jacoco": jacoco,
                    "classname": t + self.suffix
                }
            )
            print(command)
            commands.append(command)
        return commands

    def compileTestsCommands(self):
        commands = []
        for t in self.testclasses:
            src = self.getSrcPath(t)
            bin_ = self.getBinPath()
            self.genFolders(bin_)
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
            commands.append(command)
        return commands

    def getSrcPath(self, testclass):
        package = self.getPackage(testclass)
        return os.path.join("tests", self.tool, "src", *package)

    def getBinPath(self):
        return os.path.join("tests", self.tool, "bin")

    def getPackage(self, testclass):
        return filter(lambda s: s[0] >= 'a', testclass.split("."))

    def getClassName(self, testclass):
        return testclass.split(".")[-1]

    def getReportPath(self):
        return os.path.join("reports", self.tool)


class RandoopTestGenerator(TestGenerator):

    def __init__(self, testclasses):
        super(RandoopTestGenerator, self).__init__(testclasses)
        self.tool = "randoop"
        self.suffix = "_Test"

    def genCommand(self, testclass):
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

    def genCommand(self, testclass):
        jars = os.path.join("jars", "evosuite-master-1.0.5.jar")
        classpath = os.path.abspath("bin")
        options = " ".join([
            "-generateSuite",
            "-Dsearch_budget=60",
            "-Dstopping_condition=MaxTime",
            "-Duse_separate_classloader=false"
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

    def getSrcPath(self, testclass):
        suffix = "evosuite-tests"
        package = self.getPackage(testclass)
        return os.path.join("tests", self.tool, "src", suffix, *package)


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

    evo = EvoTestGenerator(testclasses)
    pprint(evo.run(1))
