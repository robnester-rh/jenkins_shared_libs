#!/usr/bin/env groovy
library "github.com/robnester-rh/jenkins_shared_libs@${params.branch}"

//@Library("github.com/robnester-rh/jenkins_shared_libs@devel") _

env.REMOTE = env.BRANCH_NAME ?: 'https://github.com/robnester-rh/jenkins_shared_libs.git'
//env.ghprbActualCommit = env.ghprbActualCommit ?: 'master'

library identifier: "jenkins_shared_libs@${env.BRANCH_NAME}",
        retriever: modernSCM([$class: 'GitSCMSource',
                              remote: "${env.REMOTE}"])
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

