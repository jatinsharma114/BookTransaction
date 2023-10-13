FROM openjdk:17
COPY target/*.jar /
CMD ["java", "-jar", "/app.jar"]
