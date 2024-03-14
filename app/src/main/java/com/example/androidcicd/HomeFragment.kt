package com.example.androidcicd

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
}

//pipeline {
//    agent any
//
//            environment {
//                JAVA_HOME = '/Users/admin/Library/Java/JavaVirtualMachines/openjdk-21.0.1/Contents/Home'
//                ANDROID_HOME = '/Users/admin/Library/Android/sdk'
//            }
//
//    options {
//        timeout(time: 1, unit: 'HOURS') // Set a timeout for the entire pipeline
//    }
//
//    stages {
//        stage('Checkout') {
//            steps {
//                script {
//                    // Ensure Gradle wrapper exists and is executable
//                    sh 'chmod +x gradlew'
//                    // Checkout your source code from your version control system (e.g., Git)
//                    git url: 'https://github.com/PushpendraPayRup/Android-CI_CD.git'
//                }
//            }
//        }
//        stage('Build') {
//            steps {
//                script {
//                    sh './gradlew assembleDebug'
//                }
//            }
//        }
//        stage('Archive APK') {
//            steps {
//                script {
//                    // Archive the generated APK file
//                    archiveArtifacts artifacts: '**/*.apk', fingerprint: true
//                }
//            }
//        }
//    }
//    post {
//        always {
//            // Clean up workspace
//            cleanWs()
//        }
//    }
//}