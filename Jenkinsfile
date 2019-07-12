pipeline {
  agent any
  stages {
    stage('maven complie') {
      steps {
        sh './mvnw compile'
      }
    }
    stage('maven build package') {
      steps {
        sh './mvnw clean package'
      }
    }
  }
}