#!/bin/bash

mvn package
java -jar target/dropwizard-example-0.8.0-rc2-SNAPSHOT.jar server example.yml

