FROM openjdk:17-jdk-alpine
LABEL authors="Taamallah"
EXPOSE 8888
ADD target/ConfigServer-0.0.1.jar ConfigServer-0.0.1.jar
ENTRYPOINT ["java","-jar","/ConfigServer-0.0.1.jar"]