FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/*.jar employee-service-docker.jar
ENTRYPOINT ["sh","-c","java -jar /employee-service-docker.jar"]