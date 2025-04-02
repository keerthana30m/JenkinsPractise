pipeline{
    agent any
        tools{
            jdk 'JDK 21'
            maven 'Maven 3'
        }
        stages{
            stage('Build Maven'){
                steps{
                    checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/keerthana30m/JenkinsPractise.git']])
                    bat 'mvn clean install'
                }
            }
           
        }
}