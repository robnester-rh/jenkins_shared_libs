package org.centos

def makeItBump(word){
    stage('Bump It'){
        echo ("${word} is bumpin'")
    }
}