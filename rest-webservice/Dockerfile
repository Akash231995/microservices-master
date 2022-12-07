#Start with base image containing java runtime
FROM openjdk:8-jdk-alpine

#Information around who maintain the image
MAINTAINER techsavvy

#Add the application's jar to the container
COPY target/rest-webservice-1.0.jar rest-webservice-1.0.jar

#execute the application
ENTRYPOINT ["java","-jar", "/rest-webservice-1.0.jar"]