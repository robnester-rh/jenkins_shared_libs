#!/usr/bin/env groovy
library "daFoo@${params.branch}"
def lib_path = "Utils@${params.branch}"

library identifier: new String(lib_path), retriever: modernSCM(
        [$class: 'GitSCMSource',
         remote: 'git@github.com:robnester-rh/jenksin_shared_libs.git'
        ])
import org.centos.Utils

def utils = new Utils()

def myWord = 'snake'

node(''){
    stage('check params'){
        echo params.branch

    }
}

daFoo {
    word = myWord
}

utils.makeItBump(myWord)