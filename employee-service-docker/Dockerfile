FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/employee-service-docker.jar employee-service-docker.jar
ENTRYPOINT ["sh","-c","java -jar /employee-service-docker.jar"]