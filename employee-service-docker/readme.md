# Run Spring Boot Application in Docker with Maven Integration.
Spotify Plugin. Reads Dockerfile and build image.

# Run the image
docker run -p 8080:8080 employee-service-docker:1.0
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



