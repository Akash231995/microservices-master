#Start with base image containing java runtime
FROM openjdk:8-jdk-alpine

#Information around who maintain the image
MAINTAINER techsavvy

#Add the application's jar to the container
COPY target/ms-discoveryserer-1.0.jar ms-discoveryserer-1.0.jar

#execute the application
ENTRYPOINT ["java","-jar", "/ms-discoveryserer-1.0.jar"]