#!/bin/bash
javac -cp "lib/*" ElementaryDataStructures/Iterator.java ElementaryDataStructures/ForwardList.java ElementaryDataStructures/Tests/ForwardListTests.java TestRunner.java

java -cp "./:lib/*"  TestRunner
