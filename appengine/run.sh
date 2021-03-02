#!/bin/sh

java -Djava.security.egd=file:/dev/./urandom -jar /server.jar db migrate config.yaml
java -Djava.security.egd=file:/dev/./urandom -jar /server.jar server config.yaml