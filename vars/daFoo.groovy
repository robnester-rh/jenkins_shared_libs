def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    node() {
        stage('squiggle it'){
            echo "${config.word} squiggles"
        }
    }
}