FROM maven:3.9.9-eclipse-temurin-21 AS builder
#FROM maven:3.9-amazoncorretto-21 AS builder

WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY src ./src
RUN mvn clean package -DskipTests -U


FROM openjdk:21-jdk AS runner
WORKDIR /app
COPY --from=builder ./app/target/patient-service-0.0.1-SNAPSHOT.jar ./app.jar
EXPOSE 4000
#ENV SPRING_DATASOURCE_URL=jdbc:postgresql://patient-service-db:5432/db \
#    SPRING_DATASOURCE_USERNAME=admin_user \
#    SPRING_DATASOURCE_PASSWORD=password \
#    SPRING_JPA_HIBERNATE_DDL_AUTO=update \
#    SPRING_SQL_INIT_MODE=always \
#    BILLING_SERVICE_ADDRESS=billing-service \
#    BILLING_SERVICE_GRPC_PORT=9001 \
#    SPRING_KAFKA_BOOTSTRAP_SERVERS=kafka:9092

ENTRYPOINT ["java", "-jar", "app.jar"]