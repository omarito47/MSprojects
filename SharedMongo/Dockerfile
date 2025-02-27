FROM openjdk:17-jdk-alpine
LABEL authors="Taamallah"
#EXPOSE 8081
ADD target/SharedMongo-1.0.jar SharedMongo-1.0.jar
ENTRYPOINT ["java","-jar","/SharedMongo-1.0.jar"]