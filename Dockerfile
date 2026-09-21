FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/java-devops-sample-1.0.0.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
