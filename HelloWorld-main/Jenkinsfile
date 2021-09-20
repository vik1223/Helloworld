pipeline {
    
    agent any 
    
    environment {
        dockerImage = ''
        registry = 'localhost/helloworld'
    }
        
    stages {
        
        stage('Checkout') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/ManojSidhanti/HelloWorld']]])
            }
        }
        
        stage('Build and Test') {
            steps {
                bat 'gradlew clean build'                    
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    dockerImage = docker.build registry
                }
            }
        }
        stage('Run Docker Container') {
            steps {
                script {
                    bat 'docker container rm -f hello-world-container' 
                    dockerImage.run("-p 8081:8080 --rm --name hello-world-container")
                }
            }
        }
    }
}