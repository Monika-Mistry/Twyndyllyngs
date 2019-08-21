FROM maven:latest AS build

COPY . .

RUN [ "mvn" , "package" ]

FROM java:8

COPY --from=build target/CoreAPI-0.0.1-SNAPSHOT.jar /opt/CoreAPI-0.0.1-SNAPSHOT.jar

EXPOSE 8000

ENTRYPOINT [ "java" , "-jar" , "/opt/CoreAPI-0.0.1-SNAPSHOT.jar" ]