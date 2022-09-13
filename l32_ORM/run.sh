#!/bin/bash
docker run --rm -it -v $(pwd):/project maven:3-jdk-8-slim mvn compile assembly:single -f /project
docker-compose up
# java -jar tester.jar