# API Java

REST API built with Java and Spring Boot for study and portfolio purposes. The project demonstrates a complete backend stack with Spring Web, Spring Data JPA, entity relationships, basic error handling, and an in-memory database for development.

## Overview

The system models a simple store with the following resources:

- Users
- Products
- Categories
- Orders
- Order items
- Payments

The project was structured to support backend learning, layered architecture, and JPA persistence best practices.

## Tech Stack

- Java 25
- Spring Boot 4.1
- Spring Web MVC
- Spring Data JPA
- H2 Database
- PostgreSQL driver
- Maven Wrapper

## Project Structure

- entities: JPA entities and domain relationships
- repositories: data access interfaces
- services: business rules and queries
- resources: REST controllers and exception handling
- config: test environment configuration

## Domain Model

- User has many Order records
- Order belongs to a User and has many OrderItem records
- OrderItem links Order and Product
- Product has many Category records
- Order has a Payment
- OrderStatus controls the order state

## Endpoints

### Users

- GET /users - list all users
- GET /users/{id} - get a user by id
- POST /users - create a user
- PUT /users/{id} - update a user
- DELETE /users/{id} - delete a user

### Products

- GET /products - list all products
- GET /products/{id} - get a product by id

### Categories

- GET /categories - list all categories
- GET /categories/{id} - get a category by id

### Orders

- GET /orders - list all orders
- GET /orders/{id} - get an order by id

## Error Handling

When a resource is not found, the API returns 404 Not Found with a standardized payload via ResourceExceptionHandler.

## Database and Profiles

The project is configured to start with the test profile by default.

- In-memory database: H2
- H2 console: /h2-console
- JDBC URL: jdbc:h2:mem:testdb

Main configuration file:

- src/main/resources/application.properties

Test profile configuration:

- src/main/resources/application-test.properties

## How to Run

### Prerequisites

- Java 25
- Maven Wrapper available in the project

### Running the application

```bash
./mvnw spring-boot:run
```

The application runs by default at http://localhost:8080.

### Running tests

```bash
./mvnw test
```

## H2 Console

With the application running, open:

```text
http://localhost:8080/h2-console
```

Use the JDBC URL configured in the test profile to connect to the in-memory database.

## Notes

- The project uses com.paulo.api_java as the base package.
- The entities are split into layers to make the project easier to study and maintain.
- This repository is a solid base for future improvements such as authentication, pagination, OpenAPI documentation, and validation.