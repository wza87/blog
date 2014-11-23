#!/bin/sh

echo "#################################################################"
echo "This Script will pull latest code from git"
echo "and build spring boot application"
echo "#################################################################"

echo "#################################################################"
echo "Checking for build lock file"
echo "#################################################################"

date_time=$(date "+%Y-%m-%d %H:%M:%S")
lock_file=/home/wza/scripts/.build_lock
if [ -e $lock_file ]
then
  echo "[$date_time] : Previous process still running, exit..."
  exit 0;
else
  echo "[$date_time] : Lock File checking done. Proceed..."
  echo "[$date_time] : $$" > $lock_file
fi

echo "#################################################################"
echo "Removing old files in target folder"
echo "#################################################################"
rm -rf /opt/wza-blog/target

echo "#################################################################"
echo "Pulling Changes from GIT branch"
echo "#################################################################"
cd /opt/wza-blog
git checkout master
git pull origin

echo "#################################################################"
echo "Building Spring boot application"
echo "#################################################################"
cd /opt/wza-blog
mvn package

# remove lock file
rm $lock_file
