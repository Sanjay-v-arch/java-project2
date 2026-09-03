pipeline {
    agent any

    environment {
        APP_ENV = 'development'
        APP_VERSION = "${BUILD_NUMBER}"
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                sh '''
                    export PATH="/mnt/d/software testing/apache-maven-3.9.16-bin/apache-maven-3.9.16/bin:$PATH"
                    mvn clean package
                '''
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t java-project2:$BUILD_NUMBER .'
            }
        }

        stage('Docker Compose Deploy') {
            steps {
                sh '''
                    docker compose down
		    docker compose up -d
                    docker compose ps
                '''
            }
        }
    }
}
