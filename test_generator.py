import sys
import os
import subprocess
from multiprocessing import Process
import csv
from pprint import pprint


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
    classpath = os.path.abspath("bin")
    options = " ".join([
        "-generateSuite",
        "-Dsearch_budget=60",
        "-Dstopping_condition=MaxTime"
    ])
    command = "java -ea -jar {jars} -projectCP {classpath} {options} -class {testclass} -base_dir {output_dir}".format(
        **{
            "jars": jars,
            "classpath": classpath,
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
    "collections.iterators.FilterIterator",
    "collections.map.PredicatedMap",
    "math.genetics.ElitisticListPopulation",
]


def compileCommands(src, bin_, tool, testclass):
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
    return command

def compileCommandsRandoop():
    commands = []
    tool = "randoop"
    for t in testclasses:
        src = os.path.join("tests", t, tool, "src")
        bin_ = os.path.join("tests", t, tool, "bin")
        genFolders(src)
        genFolders(bin_)
        commands.append(compileCommands(src, bin_, tool, t))
    return commands


def genCommands(genCommand, tool):
    commands = []
    for t in testclasses:
        path = os.path.join("tests", t, tool, "src")
        genFolders(path)
        commands.append(genCommand(t, path))
    return commands


def runTestsCommand(bin_, report, testclass, classname):
    jars = os.path.join("jars", "*")
    classpath = os.pathsep.join([".", "bin", bin_, jars])
    jacoco = "{jar}=destfile={report_out}.exec".format(
        **{
            "jar": os.path.join("jars", "jacocoagent.jar"),
            "report_out": os.path.join(report, testclass),
        }
    )
    command = "java -cp {classpath} -javaagent:{jacoco} org.junit.runner.JUnitCore {classname}".format(
        **{
            "classpath": classpath,
            "jacoco": jacoco,
            "classname": classname
        }
    )
    return command


def runTestsCommandRandoop():
    commands = []
    tool = "randoop"
    for t in testclasses:
        report = os.path.join("reports", t, tool)
        bin_ = os.path.join("tests", t, tool, "bin")
        genFolders(report)
        commands.append(
            runTestsCommand(bin_, report, t, "RegressionTest")
        )
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


def runRandoop(times):
    # falta mutaciones
    results = {
    }
    for _ in range(times):
        runCommands(randoopGenCommands())
        runCommands(compileCommandsRandoop())
        runCommands(runTestsCommandRandoop())
        runCommands(genReportCommand("randoop"))

        for t in testclasses:
            reports_csv = os.path.join("reports", t, "randoop", t) + ".csv"

            with open(reports_csv, "r") as coverage_results:
                for row in csv.DictReader(coverage_results):
                    class_name = row["PACKAGE"] + "." + row["CLASS"]
                    assert class_name == t
                    results.setdefault(class_name, {})

                    for h in HEADERS_JACOCO_COVERAGE:
                        results[class_name].setdefault(h, 0)
                        results[class_name][h] += int(row[h])

    for t in testclasses:
        for h in HEADERS_JACOCO_COVERAGE:
            results[t][h] /= float(times)

    return results

if __name__ == '__main__':
    r = runRandoop(1)
    pprint(r)

    # runCommands(evoCommands())
