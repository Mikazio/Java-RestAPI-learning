pipeline {
  agent any
  stages {
    stage('maven build') {
      steps {
        sh 'mvn spring-boot:run -X'
      }
    }
  }
}