#!/bin/bash

mvn package

if [ $? -eq 0 ]
then
  echo "compile worked!"
fi

