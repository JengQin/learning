#!/bin/bash

HOME_PATH="${maven.home.path}"
JAR_FILE="${HOME_PATH}/data-producer-1.0.jar"
PID_FILE="${HOME_PATH}/dimension-proxy.pid"

if [ -f ${PID_FILE} ]; then
    PID=`cat ${PID_FILE}`
    if ps -p ${PID} > /dev/null; then
        echo 'The process exist!'
        exit;
    fi
fi

echo 'The program '${JAR_FILE}' starting...'
nohup java -cp ${JAR_FILE} com.jeng.game.server.Server & PID=$!
echo "PID[${PID}]"
echo ${PID} > ${PID_FILE}
