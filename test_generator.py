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
    command = "java -ea -classpath {classpath} {randoop} --testclass={testclass} {options} --junit-output-dir={output_dir}".format(
        **{
            "classpath": classpath,
            "randoop": randoop,
            "testclass": testclass,
            "options": options,
            "output_dir": output_dir
        }
    )
    print(command)
    return command


def genTestsEvoCommand(testclass, output_dir):
    jars = os.path.join("jars", "evosuite-master-1.0.5.jar")
    classpath = os.pathsep.join(
        ["bin"]
    )
    classfiles = os.path.join(
        "bin", testclass.replace(".", os.path.sep)) + ".class"
    options = " ".join([
        "-generateSuite",
        "-Dsearch_budget=60",
        "-Dstopping_condition=MaxTime"
    ])
    command = "java -ea -jar {jars} -projectCP {classpath} -target {classfiles} {options} -class {testclass} -base_dir {output_dir}".format(
        **{
            "jars": jars,
            "classpath": classpath,
            "classfiles": classfiles,
            "options": options,
            "testclass": testclass,
            "output_dir": output_dir,
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
        command = "javac -cp {classpath} {to_compile} -d {bin}".format(
            **{
                "classpath": classpath,
                "to_compile": to_compile,
                "bin": bin
            }
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
        command = "java -cp {classpath} -javaagent:{jacoco} org.junit.runner.JUnitCore RegressionTest".format(
            **{
                "classpath": classpath,
                "jacoco": jacoco
            }
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
        command = "java -jar {jacococli} report {exec_file} --classfiles {classfiles} --csv {csv_file} --name {tool}".format(
            **{
                "jacococli": jacococli,
                "exec_file": exec_file,
                "classfiles": classfiles,
                "csv_file": csv_file,
                "tool": tool
            }
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
    for p in processes:
        p.join()

if __name__ == '__main__':
    # runCommands(randoopGenCommands())
    # runCommands(compileCommands("randoop"))
    # runCommands(runTestsCommand("randoop"))
    # runCommands(genReportCommand("randoop"))
    runCommands(evoCommands())
