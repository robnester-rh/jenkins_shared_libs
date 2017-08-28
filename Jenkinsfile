#!/usr/bin/env groovy
def branch = 'master'
library "daFoo@${branch}"

import org.centos.Utils

def utils = new Utils()

def myWord = 'snake'

daFoo {
    word = myWord
}
utils.makeItBump(myWord)