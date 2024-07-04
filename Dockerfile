# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/app/demo.jar"]
