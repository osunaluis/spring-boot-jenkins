pipeline{
    agent any
    stages {
        stage("Branch Name"){
            steps{
                script{
                    def branchName = env.BRANCH_NAME
                    echo "Branch name: ${branchName}"
                }
            }
        }
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