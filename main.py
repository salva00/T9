import os
import sys
from threading import Thread
import pandas as pd
import random
coverage = 0


file_path = sys.argv
input_classname = "Calcolatrice"
junit_path = "./src/test/java/" + input_classname


def caso_base(input_classname, time_limit, nomeregr, nomeerr, seed, junit_path):
    os.system("mvn compile")
    os.system("java -classpath randoop-all-4.3.2.jar:./target/classes/ randoop.main.Main gentests --testclass=" +
              input_classname + " --time-limit=" + str(time_limit) + " --regression-test-basename=" + nomeregr +
              " --error-test-basename=" + nomeerr + " --randomseed=" + str(seed) + " --junit-output-dir=" + junit_path)
    os.system("mvn test")


def caso_medio(input_classname, junit_path):
    i = 0
    coverage = 0
    old_coverage = 0
    I_MAX = 50
    DELTA = 0.05
    MAX_COVERAGE = 0.90
    while coverage < MAX_COVERAGE and i != I_MAX:
        nomeerr = "Error" + str(i)
        nomeregr = "Regression" + str(i)

        caso_base(input_classname, 5, nomeregr, nomeerr, i * random.randint(1, 100), junit_path)

        csvf = pd.read_csv("./target/my-reports/jacoco.csv")
        inst_missed = csvf["INSTRUCTION_MISSED"]
        inst_covered = csvf["INSTRUCTION_COVERED"]

        coverage = inst_covered[0] / (inst_missed[0] + inst_covered[0])

        #valutazione saturazione
        if(abs(old_coverage-coverage) <= DELTA): 
            i += 1
        else:
            i=0
        old_coverage=coverage


caso_medio(input_classname, junit_path)