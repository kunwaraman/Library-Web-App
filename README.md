# Library Management System

## Overview
The **Library Management System** is a Java-based application built using **Spring Boot** to manage library operations efficiently. It allows users to **add books, issue books, return books, and maintain user and book records**. The system follows a structured backend development approach.

## Features
- 📚 **Book Management**: Add, update, delete, and search books.
- 👤 **User Management**: Register users, update profiles, and track borrowed books.
- 🔄 **Book Issuing & Returning**: Maintain records of books issued and returned.
- 📜 **Transaction History**: Track the borrowing history of users.
- 🔒 **Authentication & Authorization**: Secure access with **OAuth 2.0** and role-based access control.
- 🚀 **Redis Integration**: Improves performance with caching.
- 🔄 **DTO for Request & Response Handling**: Ensures clean API communication.

## Technologies Used
- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **MySQL**
- **Maven**
- **Redis**
- **Spring Security with OAuth 2.0**

## Installation & Setup

### Prerequisites
Ensure you have the following installed:
- ✅ **Java 17+**
- ✅ **Maven**
- ✅ **MySQL Database**
- ✅ **Spring Boot**
- ✅ **Redis**

### Steps to Run the Application
1. **Clone the repository:**
   ```sh
   git clone https://github.com/kunwaraman?tab=repositories
   cd Library-Management-System
Configure the database in application.properties:
properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/library_db
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
spring.redis.host=localhost
spring.redis.port=6379
Build and run the application:
sh
Copy
Edit
mvn spring-boot:run
Access the application at:
📌 http://localhost:8080
API Endpoints
Method	Endpoint	Description
GET	/books	Get all books
POST	/books	Add a new book
PUT	/books/{id}	Update book details
DELETE	/books/{id}	Delete a book
GET	/users	Get all users
POST	/users	Register a new user
POST	/books/issue	Issue a book to a user
POST	/books/return	Return a borrowed book
Security
🛡 Spring Security with OAuth 2.0 for authentication and authorization.
🔐 Role-based access control to restrict endpoint access.
Contributing
🤝 Contributions are welcome!
To contribute:

Fork the repository.
Create a new branch (feature-branch).
Commit your changes.
Push to the branch.
Create a Pull Request.
