#!/bin/bash
echo "Enter name of the file to push:"
read file_name

git add file_name
git commit -m "quick push script"
git push

