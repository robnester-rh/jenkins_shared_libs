package org.centos

def makeItBump(word){
    echo ("${word} is bumpin'")
}
def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    node() {
        echo "${config.word} squiggles"
    }
}