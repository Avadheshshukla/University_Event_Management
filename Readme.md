# <h1 align = "center"> User Management System Using Spring_Boot👤 </h1>
___ 
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.1.3-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>

---

<p align="left">

<!-- Project Description -->
## Overview 🪟
<p align="center">This project, named "University Event Management System," is a robust Spring Boot application designed for managing user data efficiently. It provides a set of API endpoints that allows  you to manage students and events, perform CRUD operations, and apply the specified validations. The application will use H2 as the database for simplicity and we have use validation as well  for Age shoul be in between 18 - 25yr and First letter of name shoul be capital.
</p>

<!-- Table of Contents -->
## Table of Contents📑
1. [Technologies Used](#technologies-used)
2. [Models Key Feautures](#models-key-features🔑)
3. [Usage](#usage)
4. [Controller](#controller🎮)
5. [Endpoint API reference](#endpoint-api-reference)
6. [Acknowledgments](#acknowledgments)
7. [Contact](#contact)

<!-- Technologies Used -->
## Technologies Used🧑‍💻
- Java 8
- Spring Boot
- Spring Web Initializer
- Maven 
- Spring Web Dependency  { Spring web, Lombok, Validation, H2 Databse, Spring JPA}


<!-- Model --->

## Models Key Features🔑
### 1 -> Student Model
    Attribute's
      -> StudentId (Integer)
      -> FirstName (String)
      -> LastName (String)
      -> Age (Integer)
      -> Department (Enum: ME, ECE, Civil, CSE)
 

### 2 -> Event Model
    Attributes's
      -> EventId (Integer)
      -> EventName (String)
      -> LocationOfEvent (String)
      -> Date (LocalDate)
      -> StartTime (LocalTime)
      -> EndTime (LocalTime)


<!-- Usage -->
## Usage
- Access the application at `http://localhost:8080`.
- Use the provided API endpoints to manage your User Management.

### Controller🎮:
- It consists of a class named APIController which basically controls the flow of data.
- @RestController annotation is used to make the APIController as a controller layer.
- We perform the CRUD operations such as @PostMapping , @GetMapping , @PutMapping , @DeleteMapping.

### Endpoint API Reference :

#### StudentController :
     Endpoints:
         -> POST /addStudents - Add a new student
         -> GET /allStudent - Get all students
         -> GET /studentByID/{id} - Get student by ID
         -> PUT /update/id/{id}/studentName - Update  student department
         -> DELETE /deleteStudent/{id} - Delete a student
         
#### EventController :
    Endpoints:
        -> POST /addEvents - Add  new events
        -> PUT /update/event/id/{id} - Update an event
        -> DELETE /deleteEvent/id/{id} - Delete an event
        -> GET /events - Get all events
        -> GET /allEvents/date - Get all events by date
        -> Get /eventById/{id} - Get events by id



 <!-- Acknowledgments -->
## Acknowledgments
- Thank you to the Spring Boot and Java communities for providing excellent tools and resources.

<!-- Contact -->
## Contact📲
For questions or feedback, please contact : Avadhesh Shukla👍
- Maild Id 📧: avadheshsukla1636@gmail.com

<h1 align="center">Thank You💖...<h1>
<h3 align = "center"> ***********************************************************<h3>




 
