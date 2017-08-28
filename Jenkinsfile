#!/usr/bin/env groovy
library "daFoo@${params.branch}"

@Library("github.com/robnester-rh/jenksin_shared_libs@devel") _

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