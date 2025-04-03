## Funds App
- Creating an Entity using Spring JPA
- Connecting to a Postgres Database utilizing Docker
- Creating a Repository, Service, Controller
- Utilizing JWT Authentication (Filter, Protect Endpoints) with Spring Security
- Creating a Global Exception Handler
- Sending Messages to Another Application using Apache Kafka
- Sending Messages using Email Service with Spring Boot Mail

### Docker For PostgreSQL
```bash
docker run --name funds-app-db -p 5432:5432 -e POSTGRES_USER=root -e POSTGRES_PASSWORD=s3cr3t -d postgres:latest
```