#!/bin/sh

THE_CLASSPATH=
PROGRAM_NAME=BLStrings.java


javac -classpath ".:${THE_CLASSPATH}" $PROGRAM_NAME

if [ $? -eq 0 ]
then
  echo "compile worked!"
fi
