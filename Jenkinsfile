pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
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
    }
}
