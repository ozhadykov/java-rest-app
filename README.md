# Java REST API Learning Project

A simple Spring Boot REST API application for learning Java fundamentals, built with Docker containerized MySQL database.

## 🎯 Learning Objectives

This project is designed to learn:
- Java Spring Boot framework basics
- RESTful API development
- Database integration with Hibernate and MySQL
- Docker containerization for development

**Future Goals:** Explore CI/CD with GitHub Actions and AWS deployment

## 🛠️ Technology Stack

- **Java** - Core programming language
- **Spring Boot** - Application framework
- **Spring Web** - REST API development
- **Hibernate** - Object-Relational Mapping (ORM)
- **MySQL** - Database (containerized with Docker)
- **Spring Boot DevTools** - Development tools
- **Docker** - Database containerization

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6+
- Docker and Docker Compose
- Git

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/ozhadykov/java-rest-app.git
   cd java-rest-app
   ```

2. **Start the MySQL database**
   ```bash
   docker-compose up -d mysql
   ```

3. **Install dependencies and run**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

The application will start on `http://localhost:8080`

## 🗂️ Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/example/javarestapp/
│   │       ├── JavaRestAppApplication.java
│   │       ├── controller/
│   │       ├── service/
│   │       ├── repository/
│   │       └── model/
│   └── resources/
│       └── application.properties
├── docker-compose.yml
└── pom.xml
```



## 📚 Learning Progress

- [x] Project setup with Spring Boot
- [x] Docker MySQL configuration
- [x] Basic CRUD operations
- [ ] Error handling and validation
- [ ] Testing implementation
- [ ] Future: GitHub Actions CI/CD
- [ ] Future: AWS deployment

---

*Learning project focused on Java Spring Boot fundamentals*