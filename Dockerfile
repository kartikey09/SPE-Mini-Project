# Dropped the "-alpine" tag to use the universally supported version
FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
