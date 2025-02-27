FROM openjdk:17-jdk-alpine
LABEL authors="Taamallah"
#EXPOSE 8081
ADD target/shared-1.0.jar shared-1.0.jar
ENTRYPOINT ["java","-jar","/shared-1.0.jar"]