# Run Spring Boot Application in Docker with Maven Integration.
Spotify Plugin. Reads Dockerfile and build image.
# Build the docker image from Dockerfile
docker build -t **imagename** .
# Run the image
docker run -p 8080:8080 employee-service-docker:1.0
docker run -dt --name **container-name** **image-name** 
# Version
docker --version
# List of images
docker images
# List of containers
docker container ls


# Push the Image into Docker Hub
docker login
# Tag
docker tag employee-service-docker:1.0 ab007cloud/employee-service-docker:1.0
# Push
docker push ab007cloud/employee-service-docker:1.0

# JIB Plugin. Automatically generates Docker image. Sperates class , resources and dependency.

Docker file is not required. Remove Dockerfile and Spotify Plugin.



