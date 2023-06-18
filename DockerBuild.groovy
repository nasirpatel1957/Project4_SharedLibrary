def call(String ECR_Repo_Name, String Account_id, String Region_Name){
    sh """
        docker build -t ECR_Repo_Name .
        docker tag ECR_Repo_Name:latest Account_id.dkr.ecr.Region_Name.amazonaws.com/ECR_Repo_Name:latest
    """
}
