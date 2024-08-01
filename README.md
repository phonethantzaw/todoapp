# Spring Boot To-Do Application

This is a simple To-Do application built with Spring Boot. The application provides a REST API to manage to-do items using a MySQL database.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Database Configuration](#database-configuration)
- [Running the Application](#running-the-application)
- [Project Structure](#project-structure)
- [API Endpoints](#api-endpoints)
- [License](#license)

## Prerequisites

Before you begin, ensure you have the following installed:

- [JDK 11 or later](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [Git](https://git-scm.com/downloads)
- [MySQL](https://dev.mysql.com/downloads/installer/)

## Setup

1. **Clone the repository:**

    ```sh
    git clone https://github.com/phonethantzaw/todoapp.git
    cd todoapp
    ```

2. **Build the project:**

    ```sh
    mvn clean install
    ```

## Database Configuration

1. **Set up MySQL database:**

    - Install MySQL if it is not already installed.
    - Start the MySQL server.
    - Create a new database named `tododb`:

      ```sql
      CREATE DATABASE tododb;
      ```

    - Create a new user and grant them permissions on the `tododb` database:

      ```sql
      CREATE USER 'todo_user'@'%' IDENTIFIED BY 'your_password';
      GRANT ALL PRIVILEGES ON tododb.* TO 'todo_user'@'%';
      FLUSH PRIVILEGES;
      ```

2. **Configure Spring Boot to use MySQL:**

   Update the `src/main/resources/application.properties` file with your MySQL configuration:

    ```properties
    # src/main/resources/application.properties
    spring.datasource.url=jdbc:mysql://localhost:3306/tododb
    spring.datasource.username=todo_user
    spring.datasource.password=your_password
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
    ```

## Running the Application

1. **Run the application using Maven:**

    ```sh
    mvn spring-boot:run
    ```

   Alternatively, you can run the application by executing the generated JAR file:

    ```sh
    java -jar target/todoapp-0.0.1-SNAPSHOT.jar
    ```


## API Endpoints
**GET /api/todos: Retrieve all to-dos.**

**GET /api/todos?id={id}: Retrieve a specific to-do by ID.**

**POST /api/todos: Create a new to-do.**

**PUT /api/todos/{id}: Update an existing to-do by ID.**

**DELETE /api/todos/{id}: Delete a to-do by ID.**
