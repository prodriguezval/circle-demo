FROM adoptopenjdk:8u212-b03-jdk-hotspot

RUN mkdir app

ADD . /app

WORKDIR /app
RUN ./mvnw clean compile

CMD ["./mvnw", "spring-boot:run"]