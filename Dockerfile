# Use Maven to build the app
FROM maven:3.9.6-eclipse-temurin-17 as build

WORKDIR /app

# Copy all source code
COPY . .

# Build the JAR
RUN mvn clean package -DskipTests

# Now create a lighter runtime image
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy only the built JAR from the previous stage
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
