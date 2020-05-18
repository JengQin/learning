#!/bin/bash


flume-ng agent --conf ./conf/ -f conf/taildirSource.properties -Dflume.root.logger=info,console -n a1

flume-ng agent --conf /work/flume-collect/conf/ -f /work/flume-collect/conf/taildirSource.properties -Dflume.root.logger=info,console -n a1