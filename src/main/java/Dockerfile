FROM openjdk:21
EXPOSE 8812
ADD target/jenkin-cicd jenkin-cicd.jar
ENTRYPOINT ["java",".jar","jenkin-cicd.jar"]