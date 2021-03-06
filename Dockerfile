
FROM maven:3.8-openjdk-16 AS builder

WORKDIR /usr/src/app

COPY pom.xml package*.json ./
RUN mvn -B dependency:go-offline

COPY ./ ./
RUN mvn -B package -Pproduction


FROM openjdk:16

EXPOSE 8080
WORKDIR /usr/src/app

COPY --from=builder /usr/src/app/target/*.jar ./app.jar

CMD ["java", "-jar", "-Dspring.profiles.active=prod", "app.jar"]
