FROM openjdk:latest

ADD target/lab_4-1.0-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
