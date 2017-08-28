#!/usr/bin/env groovy
library "github.com/robnester-rh/jenkins_shared_libs@${params.branch}"

//@Library("github.com/robnester-rh/jenkins_shared_libs@devel") _

library identifier: "jenkins_shared_libs@${env.branch}",
        retriever: modernSCM([$class: 'GitSCMSource',
                              remote: "https://github.com/robnester-rh/jenkins_shared_libs@${params.branch}"])

import org.centos.*
//import org.centos.Utils

def utils = new Utils()

def myWord = 'snake'

node(''){
    stage('check params') {
        echo params.branch
    }
    daFoo {
        word = myWord
    }
    utils.makeItBump(myWord)
}

