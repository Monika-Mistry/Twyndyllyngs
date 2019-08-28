FROM maven:latest AS build

COPY . .

RUN mvn package

FROM java:8

COPY --from=build target/AuditConsumer-0.0.1-SNAPSHOT.jar /opt/AuditConsumer-0.0.1-SNAPSHOT.jar

EXPOSE 8008

ENTRYPOINT java -jar /opt/AuditConsumer-0.0.1-SNAPSHOT.jar