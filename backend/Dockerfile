FROM eclipse-temurin:21-jdk as builder

WORKDIR /app

COPY . .

RUN ./mvnw clean package


FROM eclipse-temurin:21-jre-alpine

LABEL maintainer="Bansikah <tandapnoelbansikah>"
LABEL application="fullstact-backend"

ENV APP_VERSION=0.0.1-SNAPSHOT

COPY --from=builder /app/target/backend-${APP_VERSION}.jar /app/app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]