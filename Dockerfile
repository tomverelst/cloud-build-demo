FROM maven:3.6.0-jdk-11-slim as builder

WORKDIR /usr/src/app

COPY pom.xml pom.xml

RUN mvn dependency:go-offline

COPY src/ src/

RUN mvn clean install

FROM openjdk:11-jre

COPY --from=builder target/cloud-build-demo-0.0.1-SNAPSHOT.jar /usr/src/app/app.jar

CMD ["java", "-jar", "/usr/src/app/app.jar"]
