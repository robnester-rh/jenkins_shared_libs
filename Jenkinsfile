#!/usr/bin/env groovy
library "daFoo@${params.branch}"

import org.centos.Utils

def utils = new Utils()

def myWord = 'snake'

node{
    stage('check params'){
        echo params.branch

    }
}

daFoo {
    word = myWord
}
utils.makeItBump(myWord)