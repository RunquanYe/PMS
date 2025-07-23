
FROM maven:3.9.9-eclipse-temurin-21 AS builder

WORKDIR /app
RUN mvn dependency:go-offline -B
COPY src ./src
RUN mvn clean package -DskipTests -U  # Skip tests & force update.


FROM openjdk:21-jdk AS runner

WORKDIR /app
COPY --from=builder ./app/target/auth-service-0.0.1-SNAPSHOT.jar ./app.jar
EXPOSE 4005
#ENV SPRING_DATASOURCE_URL=jdbc:postgresql://auth-service-db:5432/db \
#    SPRING_DATASOURCE_USERNAME=admin_user \
#    SPRING_DATASOURCE_PASSWORD=password \
#    SPRING_JPA_HIBERNATE_DDL_AUTO=update \
#    SPRING_SQL_INIT_MODE=always \
#    JWT_SECRET=W2v5WkX9Qz3bRfTmYp3sDv6yPeShVmYq4t7w9zScJv0=

ENTRYPOINT ["java", "-jar", "app.jar"]