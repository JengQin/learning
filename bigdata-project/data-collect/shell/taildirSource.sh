#!/bin/bash


flume-ng agent --conf ./conf/ -f conf/taildirSource.properties -Dflume.root.logger=info,console -n a1