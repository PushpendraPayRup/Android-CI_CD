pipeline {
    agent any

    environment {
        JAVA_HOME = '/Users/admin/Library/Java/JavaVirtualMachines/openjdk-21.0.1/Contents/Home'
        ANDROID_HOME = '/Users/admin/Library/Android/sdk'
    }

    options {
        timeout(time: 1, unit: 'HOURS') // Set a timeout for the entire pipeline
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    // Ensure Gradle wrapper exists and is executable
                    sh 'chmod +x gradlew'
                    // Checkout your source code from your version control system (e.g., Git)
                    git url: 'https://github.com/PushpendraPayRup/Android-CI_CD.git'
                }
            }
        }
        stage('Build') {
            steps {
                script {
                    sh './gradlew clean assembleDebug'
                }
            }
        }
        stage('Archive APK') {
            steps {
                script {
                    // Archive the generated APK file
                    archiveArtifacts artifacts: '**/*.apk', fingerprint: true
                }
            }
        }
    }
    post {
        always {
            // Clean up workspace
            cleanWs()
        }
    }
}
