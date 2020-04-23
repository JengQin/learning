#!/usr/bin/env bash
################################################################################
# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
################################################################################

#FLINK_DIR=/Users/wuchong/dev/install/flink-1.9.0
#KAFKA_DIR=/Users/wuchong/dev/install/kafka_2.11-2.2.0
FLINK_DIR=/usr/hdp/2.6.3.0-235/flink-1.9.0
KAFKA_DIR=/usr/hdp/current/kafka-broker
ZOOKEEPER_LIST=hadoop3:2181,hadoop2:2181,hadoop1:2181
KAFKA_BROKER_LIST=hadoop1:6667
WORK_SPACE=/home/work/flink-test