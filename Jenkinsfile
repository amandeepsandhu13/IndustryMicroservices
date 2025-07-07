pipeline {
    agent any

    stages {
        stage('Clone Code') {
            steps {
                git branch 'main', url: 'https://github.com/amandeepsandhu13/IndustryMicroservices.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Post-Build') {
            steps {
                echo 'Build Completed Successfully!'
            }
        }
    }
}
