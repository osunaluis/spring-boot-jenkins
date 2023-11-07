pipeline{
    agent any
    stages {
        stage ('Test Stage'){
            steps {
                sh('./mvnw test')
            }
        }
        stage ('Build Stage'){
            steps{
                echo 'Building the project ...'
            }
        }
    }
}