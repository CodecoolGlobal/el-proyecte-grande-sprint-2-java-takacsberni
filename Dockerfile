FROM maven:3.8.6-jdk-11 as jar-creator
WORKDIR /app
COPY . .
RUN mvn package

FROM openjdk:11-jdk-oracle
WORKDIR /app
COPY --from=jar-creator /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

FROM alpine
LABEL maintainer="takacsberni"
RUN apk --update add openjdk17-jre
COPY robodog.jar robodog.jar
CMD ["java", "-jar", "robodog.jar"]
# Build and run commands:
# docker build -t robodog -f Dockerfile1.dockerfile .
# docker run --name robodog-app --rm -dp 8080:8080 robodog

