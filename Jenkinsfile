#!/usr/bin/env groovy
library "daFoo@${env.branch}"
@Library('Utils') _

import org.centos.Utils

def utils = new Utils()

def myWord = 'snake'

daFoo {
    word = myWord
}
utils.makeItBump(myWord)