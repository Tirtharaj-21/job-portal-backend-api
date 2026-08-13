# ---------- Build stage ----------
FROM eclipse-temurin:17-jdk AS build

WORKDIR /app

# Copy Maven wrapper and project files
COPY pom.xml .
COPY .mvn .mvn
COPY mvnw .

# Make Maven wrapper executable
RUN chmod +x mvnw

# Copy source code
COPY src src

# Build the Spring Boot application
RUN ./mvnw clean package -DskipTests


# ---------- Run stage ----------
FROM eclipse-temurin:17-jre

WORKDIR /app

# Copy the generated JAR
COPY --from=build /app/target/*.jar app.jar

# Application port
EXPOSE 9090

# Start Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]