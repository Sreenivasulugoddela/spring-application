FROM maven:3.8-openjdk-17 AS build
WORKDIR /training-application/app

COPY . .
RUN mvn clean install -DskipTests

COPY target/training-application.jar /app/app.jar

EXPOSE 8080

CMD ["java",  "-jar", "/app/app.jar", "--spring.profiles.active=dev"]