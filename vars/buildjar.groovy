#!/usr/bin/env groovy
def call(){
    echo "bilding thr app...."
    sh 'mvn package'
}