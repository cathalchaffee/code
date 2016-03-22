#!/bin/bash
echo "enter the name of your git repository: "

read git_repo

git init
git remote add origin https://github.com/cathalchaffee/$git_repo.git
echo "Cathal Chaffee" >> contributors.txt
echo "*~" >> .gitignore
git add contributors.txt .gitignore
git commit -m 'Initial commit with contributors'
git push -u origin master
