FROM openjdk:11

COPY . /app
WORKDIR /app

RUN ./gradlew build

CMD ["java", "-jar", "./build/libs/hello-world-kotlin-1.0-SNAPSHOT.jar"]

