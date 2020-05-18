#!/bin/bash


flume-ng agent --conf /work/flume-collect/conf/ -f /work/flume-collect/conf/event-kafka-channel.conf -Dflume.root.logger=info,console -n a1