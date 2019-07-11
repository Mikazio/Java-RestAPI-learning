pipeline {
  agent none
  stages {
    stage('maven build') {
      steps {
        sh 'mvn spring-boot:run'
      }
    }
  }
}