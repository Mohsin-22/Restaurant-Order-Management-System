# Restaurant-Order-Management-System
Project Overview
This project implements a microservices architecture for a Restaurant and Order Management System using Spring Boot. The system consists of two main services:

Restaurant Service: Manages restaurant details.
Order Service: Manages customer orders, including order details and statuses.
Both services are connected through Feign Client for inter-service communication. The project also integrates Swagger UI for API documentation.

Features
Restaurant Management:

Add, update, delete, and retrieve restaurant details.
Exposes a REST API to interact with restaurant data.
Order Management:

Create, update, and retrieve customer orders.
Orders are linked to a specific restaurant using a restaurantId.
Feign Client:

Used for inter-service communication between Order Service and Restaurant Service.
Swagger UI:

Provides an interactive API documentation interface for testing the APIs.
Database Integration:

MySQL is used to store restaurant and order data.
Architecture
The project is divided into two main Spring Boot applications:

Restaurant Service:
Exposes endpoints for managing restaurants.
Stores restaurant data in a MySQL database.
Order Service:
Manages customer orders and their statuses.
Communicates with the Restaurant Service via Feign Client to fetch restaurant details.
Technologies Used
Spring Boot (for microservices)
Spring Cloud OpenFeign (for inter-service communication)
MySQL (for database storage)
Swagger UI (for API documentation and testing)
Docker (for containerizing the applications)
Prerequisites
Java 17+
Maven or Gradle
MySQL Database
Postman or Swagger UI for testing the APIs
