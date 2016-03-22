#!/bin/bash
echo "enter name of the bash script (without the .sh)"

read script
chmod u+x $script.sh
cp $script.sh /usr/local/bin/$script
