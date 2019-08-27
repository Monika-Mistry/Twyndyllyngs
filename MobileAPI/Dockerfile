ARG PASSWORD

FROM maven:latest AS build

ARG PASSWORD

COPY . .

RUN mvn -Djasypt.encryptor.password=${PASSWORD} package

FROM java:8

ARG PASSWORD

ENV ENV_PASSWORD=${PASSWORD}

COPY --from=build target/MobileAPI-0.0.1-SNAPSHOT.jar /opt/MobileAPI-0.0.1-SNAPSHOT.jar

EXPOSE 8000

ENTRYPOINT java -jar -Djasypt.encryptor.password=${ENV_PASSWORD} /opt/MobileAPI-0.0.1-SNAPSHOT.jar
