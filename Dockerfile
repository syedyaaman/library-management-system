FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN chmod +x mvnw && ./mvnw clean install

CMD ["sh", "-c", "java -jar target/*.jar"]
