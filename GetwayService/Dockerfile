FROM openjdk:17-jdk-alpine
LABEL authors="Taamallah"
EXPOSE 8761
ADD target/DiscoveryServer-0.0.1.jar DiscoveryServer-0.0.1.jar
ENTRYPOINT ["java","-jar","/DiscoveryServer-0.0.1.jar"]