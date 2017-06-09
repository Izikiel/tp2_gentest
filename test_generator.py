import sys
import os
import subprocess
from multiprocessing import Process


def genFolders(path):
    exec_command = ""
    if sys.platform != 'win32':
        exec_command += "mkdir -p "
    else:
        exec_command = "cmd /c mkdir "
    subprocess.run(exec_command + path)


def genTestsRandoopCommand(testclass, output_dir):
    classpath = os.pathsep.join(
        [os.path.join("jars", "*"), "bin"]
    )
    randoop = "randoop.main.Main gentests"
    options = " ".join([
        "--no-error-revealing-tests=true",
        "--timelimit=60",
        "--outputlimit=30"
    ])
    command = "java -ea -classpath {0} {1} --testclass={2} {3} --junit-output-dir={4}".format(
        classpath, randoop, testclass, options, output_dir)
    print(command)
    return command


def genTestsEvoCommand(testclass, output_dir):
    command = "{0} -classpath bin -jar evosuite-master-1.0.5.jar -generateSuite -Dsearch_budget=60 -Dstopping_condition=MaxTime -class {1} -base_dir {2}".format(
        "java", testclass, output_dir)
    return command


# lo deberia levantar de un txt?
testclasses = [
    "collections.comparators.FixedOrderComparator",
    "collections.iterators.FilterIterator",
    "collections.map.PredicatedMap",
    "math.genetics.ElitisticListPopulation",
]


def compileCommands(tool):
    commands = []
    for t in testclasses:
        src = os.path.join("tests", t, tool, "src")
        bin = os.path.join("tests", t, tool, "bin")
        genFolders(src)
        genFolders(bin)
        classpath = os.pathsep.join(
            [".", os.path.join("jars", "*"), bin, "bin"]
        )
        to_compile = os.path.join(src, "*.java")
        command = "javac -cp {0} {1} -d {2}".format(
            classpath, to_compile, bin
        )
        commands.append(command)
    return commands


def genCommands(genCommand, tool):
    commands = []
    for t in testclasses:
        path = os.path.join("tests", t, tool, "src")
        genFolders(path)
        commands.append(genCommand(t, path))
    return commands


def runTestsCommand(tool):
    commands = []
    for t in testclasses:
        src = os.path.join("tests", t, tool, "src")
        bin = os.path.join("tests", t, tool, "bin")
        report = os.path.join("reports", t, tool)
        genFolders(src)
        genFolders(bin)
        genFolders(report)
        jars = os.path.join("jars", "*")
        classpath = os.pathsep.join([".", "bin", bin, jars])
        jacoco = "jars\jacocoagent.jar=destfile={0}.exec".format(
            os.path.join(report, t)
        )
        command = "java -cp {0} -javaagent:{1} org.junit.runner.JUnitCore RegressionTest".format(
            classpath, jacoco
        )
        commands.append(command)
    return commands


def genReportCommand(tool):
    commands = []
    for t in testclasses:
        report_file_name = os.path.join("reports", t, tool, t)
        exec_file = report_file_name + ".exec"
        csv_file = report_file_name + ".csv"

        jacococli = os.path.join("jars", "jacococli.jar")
        classfiles = os.path.join(
            "bin", t.replace(".", os.path.sep)) + ".class"
        command = "java -jar {0} report {1} --classfiles {2} --csv {3} --name {4}".format(
            jacococli, exec_file, classfiles, csv_file, tool
        )
        commands.append(command)
    return commands


def randoopGenCommands():
    return genCommands(genTestsRandoopCommand, "randoop")


def evoCommands():
    return genCommands(genTestsEvoCommand, "evo")


def runCommands(commands):
    processes = [Process(target=subprocess.run, args=(c,)) for c in commands]
    for p in processes:
        p.start()
        p.join()

if __name__ == '__main__':
    runCommands(randoopGenCommands())
    runCommands(compileCommands("randoop"))
    runCommands(runTestsCommand("randoop"))
    runCommands(genReportCommand("randoop"))
