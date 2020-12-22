FROM openjdk:8-jre-alpine

COPY target/demo-0.0.1-SNAPSHOT.jar /app.jar

ENTRYPOINT [ "java", "-jar", "-Dserver.port=8080", "/app.jar" ]
EXPOSE 8080
