FROM maven:latest AS build

COPY . .

RUN [ "mvn" , "package" ]

FROM java:8

COPY --from=build target/VehicleAPI-0.0.1-SNAPSHOT.jar /opt/VehicleAPI-0.0.1-SNAPSHOT.jar

EXPOSE 8000

ENTRYPOINT [ "java" , "-jar" , "/opt/VehicleAPI-0.0.1-SNAPSHOT.jar" ]