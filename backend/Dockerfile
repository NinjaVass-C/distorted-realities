#maven image
FROM maven:3.9.12-eclipse-temurin-25-alpine AS build

#set working directory
WORKDIR /app

# Copy the pom.xml and any other necessary configuration files
COPY pom.xml /app
COPY src /app/src

# Build the application (skip tests)
RUN mvn clean package -Dmaven.test.skip=true

# ---------------------
# Run stage
# ---------------------
FROM eclipse-temurin:25-jdk AS runtime

WORKDIR /app

# Copy built JAR
COPY --from=build /app/target/*.jar app.jar

# Expose Spring Boot default port
EXPOSE 8080

# Run the app
CMD ["java", "-jar", "app.jar"]
