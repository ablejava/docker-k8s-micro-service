#!/usr/bin/env bash


mvn package
if [ $? != 0 ];then
    echo "mvn package failed!!!"
    exit 1
fi
docker build -t course-service:latest .

#docker run -idt -p 8082:8082 imooc-user-edge-service:latest \ --mysql.address=192.168.1.7
