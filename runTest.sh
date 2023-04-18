#!/bin/sh

#compilo il file
mvn compile &&

# creo i file di regration test
java -classpath randoop-all-4.3.2.jar:./target/classes/ randoop.main.Main gentests --testclass=$1 --output-limit=60 &&

# sposto i file nella cartella 

mv RegressionTest0.java ./src/test/java/ &&
mv RegressionTest.java ./src/test/java/ &&

# eseguo i test
mvn test &&

# mostro copertura con jacoco

column -s, -t < ./target/my-reports/jacoco.csv | less -#2 -N -S