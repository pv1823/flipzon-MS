# 🛒 Flipzon - Scalable E-Commerce Microservice

![Java](https://img.shields.io/badge/Java-17+-blue.svg)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.0-brightgreen)
![Dockerized](https://img.shields.io/badge/Containerized-Docker-informational)
![License](https://img.shields.io/badge/license-MIT-blue.svg)

Flipzon is a backend e-commerce microservice built with Spring Boot, featuring modular REST APIs, an in-memory database, and clean architecture ready for scaling. Designed with industry best practices in mind, this service is perfect for integration with modern front-end frameworks like ReactJS.

## 🚀 Features

- ✅ RESTful APIs for Products, Cart, and User Profiles
- ✅ In-memory H2 database with Spring Data JPA
- ✅ JUnit 4 test coverage
- ✅ Ready to integrate with frontend (React/Angular)
- ✅ Scalable microservice structure
- ✅ Docker support for containerized deployments

## 🧱 Tech Stack

| Layer         | Technology                  |
|---------------|------------------------------|
| Language      | Java 17+                    |
| Framework     | Spring Boot 3.x             |
| Database      | H2 (in-memory)              |
| Build Tool    | Maven                       |
| Container     | Docker                      |
| Testing       | JUnit 4                     |

## 📁 Project Structure

```
Flipzon/
├── src/main/java/com/flipzon/
│   ├── controller/
│   ├── service/
│   ├── repository/
│   └── model/
├── src/test/java/...
├── resources/
│   └── application.properties
├── Dockerfile
├── pom.xml
└── README.md
```

## 🛠️ Getting Started

### 🔧 Prerequisites

- Java 17+
- Maven 3+
- Docker (optional, for containerized setup)

### 🔃 Run Locally

```bash
# Clone the repo
git clone https://github.com/pv1823/Flipzon.git
cd Flipzon

# Build and run
mvn clean install
mvn spring-boot:run
```

Visit Swagger UI: `http://localhost:8080/swagger-ui.html`

### 🧪 Run Tests

```bash
mvn test
```

### 🐳 Docker Setup

```bash
# Build image
docker build -t flipzon-service .

# Run container
docker run -p 8080:8080 flipzon-service
```

## 🧪 Postman Collection

You can import the `Flipzon.postman_collection.json` file to test:
- `/products` – GET, POST
- `/cart` – GET, POST, DELETE
- `/users` – GET, POST

## 👨‍💻 Future Enhancements

- Integrate with React frontend
- Add user authentication (JWT)
- Migrate to MySQL/PostgreSQL
- Add Swagger/OpenAPI 3.0 annotations

## 📄 License

This project is licensed under the [MIT License](LICENSE).

## 🙋‍♂️ Author

**Pawan Varanasi**  
[GitHub: pv1823](https://github.com/pv1823)  
[LinkedIn](https://linkedin.com/in/pawan-varanasi-08b070172)