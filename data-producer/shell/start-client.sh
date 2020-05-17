#!/bin/bash

HOME_PATH="${maven.home.path}"
JAR_FILE="${HOME_PATH}/data-producer-1.0.jar"
PID_FILE="${HOME_PATH}/dimension-proxy.pid"

count=$1
logType=$2
interval=$3

echo 'The program '${JAR_FILE}' starting...'
nohup java -cp ${JAR_FILE} com.jeng.game.client.Client -c ${count} -logType ${logType} -i ${interval} &
