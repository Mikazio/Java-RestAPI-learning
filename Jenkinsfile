pipeline {
  agent any
  stages {
    stage('maven build') {
      steps {
        sh './mvnw clean package'
      }
    }
  }
}