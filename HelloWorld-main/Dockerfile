FROM openjdk:11-jre-slim-buster
ADD build/libs/helloworld-1.0.0.jar helloworld.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "helloworld.jar"]