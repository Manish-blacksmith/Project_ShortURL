# Project_ShortURL

Welcome to the Short URL Project! This repository contains a web application developed using Java Spring Boot for the backend, MySQL as the database, and Angular for the frontend. The project enables users to create, manage, and track short URLs for easier sharing of links.

## Prerequisites

Before you begin, make sure you have the following software installed:

- Java Development Kit (JDK)
- Node.js and npm (Node Package Manager)
- MySQL database

## Getting Started

Follow the steps below to set up and run the project:

### Backend (Java Spring Boot)

1. Clone this repository: 
2. Navigate to the `backend` directory:
3. Open `src/main/resources/application.properties` and configure the MySQL database connection settings.
4. Build and run the Spring Boot application:

### Frontend (Angular)

1. Navigate to the `frontend` directory:
2. Install Angular CLI if not already installed:
3. Install project dependencies:
4. Update `src/environments/environment.ts` with the backend API URL.
5. Build and run the Angular application:
6. Open your web browser and access the application at `http://localhost:4200`.

## Backend (Java Spring Boot)

The backend of the project is built using Java Spring Boot, providing the following components:

- **Controllers:** Responsible for handling incoming HTTP requests, interacting with the service layer, and returning appropriate responses to clients.
- **Services:** Implement business logic, interact with the database using JPA (Java Persistence API), and provide data to controllers.
- **Models:** Define data structures as Java classes. These models are used to map data between the Java application and the database.
- **Repositories:** Interface with Spring Data JPA to perform CRUD operations on the database entities.
- **Configuration:** Contains configurations related to the Spring Boot application, such as database connection settings.
- **Security:** Implement security features like user authentication and authorization using Spring Security.

## Frontend (Angular)

The frontend of the project is developed using Angular, with the following components:

- **Components:** Organize the application into modular components, such as URL creation, URL listing, and user authentication.
- **Services:** Handle API requests to the backend, enabling communication between the frontend and the backend.
- **Models:** Define TypeScript interfaces to represent data structures received from or sent to the backend.
- **Views:** Define HTML templates for each component, providing the user interface for interaction.

## Usage

- Access the application in your web browser.
- Enter the original URL to generate a short URL.
- View and manage your URLs

## Technologies Used

- Java Spring Boot: Backend framework
- MySQL: Database management system  
- Angular: Frontend framework  version 16.1.0

## Contributing

Contributions are welcome! If you'd like to contribute to this project, fork the repository, make your changes, and create a pull request.




