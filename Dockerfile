FROM openjdk:17-jdk-slim

WORKDIR /app

COPY . .

RUN chmod +x mvnw && ./mvnw clean install

CMD ["sh", "-c", "java -jar target/*.jar"]
