FROM openjdk:17
//COPY target/app.jar app.jar
COPY target/*.jar /
CMD ["java", "-jar", "/app.jar"]
