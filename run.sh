#!/bin/bash
javac -cp "lib/*" ElementaryDataStructures/Iterator.java ElementaryDataStructures/ForwardList.java ElementaryDataStructures/Tests/ForwardListTests.java ElementaryDataStructures/ListStack.java ElementaryDataStructures/Tests/ListStackTests.java TestRunner.java

java -cp "./:lib/*"  TestRunner
