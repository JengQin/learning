#!/bin/bash


flume-ng agent --conf /data/work/flume-collect/conf/ -f /data/work/flume-collect/conf/event-kafka-channel.conf -Dflume.root.logger=info,console -n a1