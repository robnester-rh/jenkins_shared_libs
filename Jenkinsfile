#!/usr/bin/env groovy
library "daFoo@${env.branch}"
@Library("Utils@${env.branch}") _

import org.centos.Utils

def utils = new Utils()

def myWord = 'snake'

daFoo {
    word = myWord
}
utils.makeItBump(myWord)