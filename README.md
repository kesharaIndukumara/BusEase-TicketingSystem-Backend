# BusEase Ticketing System

## Description
BusEase is a Spring Boot microservices-based bus ticketing system that allows users to book tickets, while providing administrative capabilities for managing users and bus owners. The system utilizes a MySQL database to store and manage data efficiently.

## Table of Contents
- [Technologies Used](#technologies-used)
- [Microservices Overview](#microservices-overview)
- [Setup and Installation](#setup-and-installation)
- [Database Setup](#database-setup)
- [API Documentation](#api-documentation)
- [Running the Application](#running-the-application)
- [Usage](#usage)
- [License](#license)
- [Contributing](#contributing)

## Technologies Used
- Spring Boot
- MySQL
- JPA/Hibernate
- REST API

## Microservices Overview
### User Service
Handles user registration, authentication, and ticket booking functionalities.

### Admin Service
Manages user accounts, bus schedules, and overall system administration tasks.

### Bus Owner Service
Enables bus owners to manage their buses and view bookings.

## Setup and Installation
### Prerequisites
- Java 11 or higher
- MySQL server

### Installation Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/kesharaIndukumara/BusEase-TicketingSystem-Backend.git
   ```
2. Navigate to the project directory:
   ```bash
   cd BusEase-TicketingSystem-Backend
   ```
3. Configure the application properties for database connection.

## Database Setup
1. Create a new database in MySQL:
   ```sql
   CREATE DATABASE bus_ease;
   ```
2. Update the `application.properties` file with your database credentials.

## API Documentation
### User Service
- **POST /users/register**: Register a new user.
- **POST /users/login**: User login.

### Admin Service
- **GET /admin/users**: Retrieve all users.
- **POST /admin/buses**: Add a new bus.

### Bus Owner Service
- **GET /bus-owner/buses**: Retrieve all buses owned by the user.
- **GET /bus-owner/bookings**: View bookings for the buses.

## Running the Application
- Run each microservice using your IDE or via command line:
   ```bash
   mvn spring-boot:run
   ```

## Usage
- Access the application through the appropriate endpoints as per the API documentation.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributing
Contributions are welcome! Please open an issue or submit a pull request for any enhancements or bug fixes.