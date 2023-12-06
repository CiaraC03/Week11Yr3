FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/UserServiceWk4-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "UserServiceWk4-0.0.1-SNAPSHOT.jar"]