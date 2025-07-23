# Patient Management System API
It is a simple patient management system api just for demo purposes. It contains some basic CRUD functional abilities for a hospital to manage patients.

## Tech Stack
    + Java Spring Boot (REST APIs)
    + gRPC (high-performance inter-service communication)
    + Kafka (asynchronous event streaming for billing & notifications)
    + Maven (dependency management)
    + Docker (containerization)
    + PostgreSQL (persistent data storage)

## Services
    + API Gateway – Routes requests to appropriate services.
    + Auth Service – Handles JWT-based authentication & authorization.
    + Patient Service – Manages patient records (CRUD operations).
    + Billing Service – Create a billing account for the patient (triggered via Kafka events and gRPC).
