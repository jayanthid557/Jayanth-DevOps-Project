FROM eclipse-temurin:17-jre-alpine
COPY target/portfolio-app-1.0.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
