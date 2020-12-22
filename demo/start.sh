mvn package
docker build -t spring-mongo:1.0 .
docker-compose up -d