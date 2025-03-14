# Todo API

## Introduction
This is a simple RESTful API for managing todo items, built using Java and Spring Boot. The API allows users to create, read, update, and delete todo items, as well as filter them based on various criteria.

## Features
- Create, read, update, and delete todo items
- Filter todos by completion status
- Filter todos by priority
- Search todos by title
- Filter todos by both completion status and priority

## Technologies Used
- Java 21
- Spring Boot 3.4.3
- Spring Data JPA
- MySQL Database
- JUnit 5 for testing

## Getting Started

### Prerequisites
- JDK 21 or higher
- MySQL 8.0 or higher
- Maven

### Setup
1. Clone the repository
2. Create a local.properties file in the src/main/resources directory:
   ```
   # Copy from the template file
   cp src/main/resources/local.properties.template src/main/resources/local.properties
   ```
3. Update the database credentials in the local.properties file:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/todo_db?createDatabaseIfNotExist=true
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```
4. Run the application using Maven: `mvn spring-boot:run`
5. The API will be available at `http://localhost:8080/api/todos`

### Database Setup
You can set up the database using the provided SQL dump file:
```sh
mysql -u root -p < todo_db_dump.sql
```

## API Endpoints

### Get All Todos
```
GET /api/todos
```

### Get Todo by ID
```
GET /api/todos/{id}
```

### Create Todo
```
POST /api/todos
```
Request Body:
```json
{
  "title": "Task Title",
  "description": "Task Description",
  "priority": "HIGH"
}
```

### Update Todo
```
PUT /api/todos/{id}
```
Request Body:
```json
{
  "title": "Updated Task Title",
  "description": "Updated Task Description",
  "completed": true,
  "priority": "MEDIUM"
}
```

### Delete Todo
```
DELETE /api/todos/{id}
```

### Filter Todos by Completion Status
```
GET /api/todos/completed?status=true
```

### Filter Todos by Priority
```
GET /api/todos/priority/{priority}
```
Example: `/api/todos/priority/HIGH`

### Search Todos by Title
```
GET /api/todos/search?keyword=task
```

### Filter Todos by Completion Status and Priority
```
GET /api/todos/filter?completed=false&priority=HIGH
```

## Project Structure
- `model`: Contains entity classes
- `repository`: Contains repository interfaces
- `service`: Contains service classes
- `controller`: Contains REST controllers
- `exception`: Contains custom exceptions and exception handlers

## Testing
Navigate to the root directory of the project and run the tests using Maven Wrapper:
```sh
./mvnw test
```

## Database Dump
The database dump file is located at `todo_db_dump.sql` in the root directory of the project.
