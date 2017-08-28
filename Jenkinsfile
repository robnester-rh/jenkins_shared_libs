#!/usr/bin/env groovy
library "daFoo@${params.branch}"

//@Library("github.com/robnester-rh/jenkins_shared_libs@devel") _
library('Utils').org.centos.Utils.makeItBump()

//import org.centos.Utils

//def utils = new Utils()

def myWord = 'snake'

node(''){
    stage('check params'){
        echo params.branch

    }
}

daFoo {
    word = myWord
}
makeItBump(myWord)