FROM openjdk:17
COPY target/app.jar app.jar
CMD ["java", "-jar", "app.jar"]