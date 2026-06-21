# 💇 Salon Booking Platform - Microservices Architecture

A production-ready Salon Appointment Booking Platform built using Java Spring Boot Microservices and React. The application enables customers to discover salons, book appointments, make secure online payments, receive real-time notifications, and manage bookings seamlessly.

This project demonstrates enterprise-level software architecture using independently deployable microservices, API Gateway, Service Discovery, Event-Driven Communication, and modern frontend development practices.

---

## 🚀 Key Features

### 👤 Customer Features

* User Registration & Authentication
* Browse Salons and Services
* Search Services by Category
* Book Salon Appointments
* Online Payments
* View Booking History
* Real-Time Booking Notifications
* Submit Ratings and Reviews

### 🏢 Salon Partner Features

* Become a Salon Partner
* Manage Salon Profile
* Manage Categories
* Manage Service Offerings
* View and Manage Bookings
* Track Customer Reviews

### 🔔 Notification Features

* Booking Confirmation Notifications
* Real-Time Updates using WebSocket
* Event-Driven Notifications using RabbitMQ

### 💳 Payment Features

* Stripe Payment Integration
* Razorpay Payment Integration
* Secure Payment Processing

---

## 🏗️ System Architecture

The application follows a Microservices Architecture pattern where each service is independently developed, deployed, and scaled.

### Backend Microservices

* User Service
* Salon Service
* Category Service
* Service Offering Service
* Booking Service
* Payment Service
* Notification Service
* Review Service

### Infrastructure Services

* Eureka Server (Service Discovery)
* API Gateway
* Keycloak Authentication Server
* RabbitMQ Message Broker

---

## 🛠️ Tech Stack

### Backend

* Java 17
* Spring Boot
* Spring Security
* Spring Cloud Gateway
* Spring Data JPA
* Hibernate
* Keycloak
* JWT Authentication
* RabbitMQ
* WebSocket
* OpenFeign
* MySQL

### Frontend

* React.js
* Redux Toolkit
* React Router
* Axios
* Formik
* HTML5
* CSS3
* JavaScript

### DevOps

* Docker
* Docker Compose
* Git
* GitHub

---

## 🔐 Security

This application implements enterprise-grade security using:

* Keycloak Identity and Access Management
* JWT-Based Authentication
* Role-Based Authorization
* Secure API Gateway Routing

---

## 📡 Microservices Communication

### Synchronous Communication

* REST APIs
* OpenFeign Client

### Asynchronous Communication

* RabbitMQ Event Messaging
* Event-Driven Architecture

---

## ⚡ Real-Time Features

WebSocket implementation enables:

* Instant Booking Notifications
* Real-Time Appointment Updates
* Live Dashboard Updates

---

## 📂 Project Structure

```text
Salon-Booking
│
├── frontend
│
├── user-service
├── salon-service
├── category-service
├── service-offering-service
├── booking-service
├── payment-service
├── notification-service
├── review-service
│
├── gateway-server
├── eureka-server
│
└── docker-compose.yml
```

---

## 🐳 Docker Support

Containerized deployment using:

* Docker
* Docker Compose


All services can be deployed and managed independently.

---

## 🎯 Learning Outcomes

This project demonstrates practical implementation of:

* Microservices Architecture
* Service Discovery
* API Gateway Pattern
* Distributed Authentication
* Event-Driven Systems
* Message Queues with RabbitMQ
* Real-Time Communication with WebSocket
* Payment Gateway Integration
* Docker Containerization
* Full Stack Development with React and Spring Boot

---

## 📈 Resume Highlights

* Developed a production-ready Salon Booking Platform using Spring Boot Microservices and React.
* Implemented secure authentication and authorization using Keycloak and JWT.
* Designed event-driven communication using RabbitMQ.
* Integrated Stripe and Razorpay payment gateways.
* Built real-time notification system using WebSocket.
* Containerized microservices using Docker and Docker Compose.
* Implemented Service Discovery and API Gateway using Spring Cloud components.

---

## 👩‍💻 Author

Aditi Inamdar

GitHub: https://github.com/aditiinamdar

---

## 📜 License

This project is intended for learning and educational purposes.
