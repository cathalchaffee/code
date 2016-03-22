#!/bin/bash


script=$1
chmod u+x $script.sh
cp $script.sh /usr/local/bin/$script
