#!/usr/bin/env groovy
library "daFoo@${params.branch}"

import org.centos.Utils

def utils = new Utils()

def myWord = 'snake'

daFoo {
    word = myWord
}
utils.makeItBump(myWord)