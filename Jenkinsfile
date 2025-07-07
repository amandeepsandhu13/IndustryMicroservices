pipeline {
    agent any

    stages {
        stage('Clone Code') {
            steps {
                git branch: 'main', url: 'https://github.com/amandeepsandhu13/IndustryMicroservices.git'
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
                    archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true

            }
        }
    }
     post {
            success {
                mail to: 'amandeepsandhu13@gmail.com',
                     subject: "✅ Build Success: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                     body: "🎉 Build was successful!\n\nCheck it here:\n${env.BUILD_URL}"
            }
            failure {
                mail to: 'amandeepsandhu13@gmail.com',
                     subject: "❌ Build Failed: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                     body: "💥 Build failed.\n\nPlease investigate the issue:\n${env.BUILD_URL}"
            }
        }
}
