node {
  stage('SCM') {
    git credentialsId: 'epronobis8', url: 'https://github.com/epronobis8/Music-sample-app-CICD'
  } 
  stage('depdenency check') {
    dependencyCheck additionalArguments: '', odcInstallation: 'owasp-check'
  }
  stage('OWASP report') {
    dependencyCheckPublisher pattern: '--format HTML --format XML'
  }
  stage('SonarQube analysis') {
    def scannerHome = tool 'sonar-scanner';
    withSonarQubeEnv('sonarqube-server') { // If you have configured more than one global server connection, you can specify its name
      sh "${scannerHome}/bin/sonar-scanner \
           -Dsonar.projectKey=sdp-sample-app \
           -Dsonar.sources=. "
    }
    
  stage('Build') {
            steps {
                sh 'make' 
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true 
            }
    }
  }
}

