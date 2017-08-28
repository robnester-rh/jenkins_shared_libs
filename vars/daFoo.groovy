def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    stage('squiggle it'){
            echo "${config.word} squiggles"
    }
}