# Step 1: Use a base image with JDK
FROM openjdk:17-jdk-slim as build

# Step 2: Set the working directory
WORKDIR /loans

# Step 3: Copy the jar file into the container
COPY target/loans.jar loans.jar

# Step 4: Expose the port the app will run on
EXPOSE 8082

# Step 5: Run the application
ENTRYPOINT ["java", "-jar", "/loans/loans.jar"]