# Java DevOps Sample

A small Maven Java project for learning a CI/CD pipeline with:

- Maven build
- JUnit unit tests
- SonarQube analysis
- SonarQube Quality Gate
- Docker image build
- Trivy container scan
- Jenkins Pipeline

## Local commands

Build:
mvn clean package

Run tests:
mvn test

Run the JAR:
java -jar target/java-devops-sample-1.0.0.jar

Build Docker image:
docker build -t java-devops-sample:1.0 .

Run container:
docker run --rm java-devops-sample:1.0

Scan with Trivy:
trivy image java-devops-sample:1.0

## Pipeline flow

Git -> Jenkins -> Maven Build -> Unit Tests -> SonarQube -> Quality Gate
-> Docker Build -> Trivy -> (later: ECR -> EKS)
