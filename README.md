# Library Management System

## Overview
The **Library Management System** is a Java-based application designed to manage the operations of a library efficiently. It enables users to perform tasks such as adding books, issuing books, returning books, and maintaining records of users and books. This system is built using Spring Boot and follows a structured backend development approach.

## Features
- **Book Management:** Add, update, delete, and search books.
- **User Management:** Register users, update profiles, and track borrowed books.
- **Book Issuing & Returning:** Maintain records of books issued and returned.
- **Transaction History:** Track the borrowing history of users.
- **Authentication & Authorization:** Secure access to different functionalities based on user roles.
- **Redis Integration:** Caching for improved performance.
- **DTO for Request & Response Handling:** Structured data transfer objects (DTOs) for clean API communication.
- **OAuth 2.0 Security:** Secure authentication using OAuth 2.0.

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
- **Java 17+**
- **Maven**
- **MySQL Database**
- **Spring Boot**
- **Redis**

### Steps to Run the Application
1. Clone the repository:
   ```bash
   git clone https://github.com/Mohit29061999/Jbdl-78.git
   cd Jbdl-78
   ```
2. Configure the database in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/library_db
   spring.datasource.username=root
   spring.datasource.password=password
   spring.jpa.hibernate.ddl-auto=update
   spring.redis.host=localhost
   spring.redis.port=6379
   ```
3. Build and run the application:
   ```bash
   mvn spring-boot:run
   ```
4. Access the application at `http://localhost:8080`

## API Endpoints
| Method | Endpoint | Description |
|--------|---------|-------------|
| GET | `/books` | Get all books |
| POST | `/books` | Add a new book |
| PUT | `/books/{id}` | Update book details |
| DELETE | `/books/{id}` | Delete a book |
| GET | `/users` | Get all users |
| POST | `/users` | Register a new user |
| POST | `/books/issue` | Issue a book to a user |
| POST | `/books/return` | Return a borrowed book |

## Security
- The application uses **Spring Security with OAuth 2.0** for authentication and authorization.
- Role-based access control is implemented to restrict access to specific endpoints.

## Contributing
1. Fork the repository
2. Create a new branch (`feature-branch`)
3. Commit your changes
4. Push to the branch
5. Create a pull request

## License
This project is open-source and available under the [MIT License](LICENSE).

## Contact
For any queries or contributions, contact the repository owner at [GitHub Issues](https://github.com/Mohit29061999/Jbdl-78/issues).

