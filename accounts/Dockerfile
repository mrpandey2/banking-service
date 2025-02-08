# Step 1: Use a base image with JDK
FROM openjdk:17-jdk-slim as build

# Step 2: Set the working directory
WORKDIR /accounts

# Step 3: Copy the jar file into the container
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts.jar

# Step 4: Expose the port the app will run on
EXPOSE 8080

# Step 5: Run the application
ENTRYPOINT ["java", "-jar", "/accounts/accounts.jar"]