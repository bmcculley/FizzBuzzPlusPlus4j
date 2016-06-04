#!/bin/bash

mkdir lib

wget http://search.maven.org/remotecontent?filepath=junit/junit/4.12/junit-4.12.jar -O lib/junit-4.12.jar
wget http://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar -O lib/hamcrest-core-1.3.jar

javac FizzBuzz.java
javac -cp .:lib/junit-4.12.jar FizzBuzzTest.java
