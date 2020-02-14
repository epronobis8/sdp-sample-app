static_code_analysis()
static_dependency_check_analysis(
    steps {
        sh 'rm owasp || true'
        sh wget 'https://github.com/epronobis8/sdp-sample-app/oswap-dependency-check.sh'
        sh 'chmod +x oswap-dependency-check.sh'
        sh 'bash oswap-dependency-check.sh'

    }
)

