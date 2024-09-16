FROM maven:3.8.6-openjdk-17
WORKDIR /training-application/app

COPY . .
RUN mvn clean install -DskipTests

COPY target/training-application.jar /app/app.jar

EXPOSE 8090

CMD ["java",  "-jar", "/app/app.jar", "--spring.profiles.active=dev"]