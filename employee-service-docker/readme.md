docker --version

docker run hello-world:latest

docker images

docker container ls

docker container stop fb28e56aa23e

## History of images
docker history ab007docker/employee-service-docker:v1


## Deploy Spring Boot Application in Docker
## Go the project path
docker build -t ab007docker/employee-service-docker:v1 .

docker run -p 8080:8080 ab007docker/employee-service-docker:v1
