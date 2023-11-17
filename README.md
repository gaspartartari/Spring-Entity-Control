# Demo Spring Boot Application
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/gaspartartari/project-springboot3-jpa/blob/main/LICENSE)

## Overview

SpringBoot-Course is a back-end web application developed for educational purposes. This project serves as a comprehensive example of building a Spring application with various functionalities.

## Project Description
The application manages entities such as users, categories, products, orders, and order items. It provides a set of RESTful APIs to perform CRUD operations on these entities. A Layered Archiquecture is implementend.

## API Example End-Points

https://app-course-f8ed8935eb48.herokuapp.com/users

https://app-course-f8ed8935eb48.herokuapp.com/users/2

https://app-course-f8ed8935eb48.herokuapp.com/orders

https://app-course-f8ed8935eb48.herokuapp.com/products

https://app-course-f8ed8935eb48.herokuapp.com/orders/3


## Features
- **User Management:** Allows the creation, retrieval, update, and deletion of user records.
- **Category Management:** Manages product categories with basic CRUD operations.
- **Product Management:** Handles products, including retrieval and manipulation.
- **Order Management:** Manages orders and associated order items.

## Conceptual Model
<img width="1149" alt="Captura de Tela 2023-11-15 às 21 26 54" src="https://github.com/gaspartartari/project-springboot3-jpa/assets/137225622/9f88016b-2f29-4522-8cf0-c96b2215dcd4">


## Technologies Used
### Back End
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Database
- PostgreSQL
- H2(test environment)

## Deployment to production 
-Back end: Heroku

-Database : PostgreSQL

## How to Run the Project
### Back End
**Prerequisites:** Java 11

```bash
# clone repository
git clone https://github.com/gaspartartari/project-springboot3-jpa.git

# navigate to the back end project folder
cd course

# run the project
./mvnw spring-boot:run
```

# Autor

Gaspar Tartari

https://www.linkedin.com/in/gaspartartari
