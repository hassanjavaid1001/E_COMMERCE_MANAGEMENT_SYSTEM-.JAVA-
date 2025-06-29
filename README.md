# Java MVC Student Database Application

This is a simple Java application (not Maven-based) that demonstrates a custom MVC framework and connects to a MySQL database.

## Project Structure

- `model/` — Contains the Student model
- `dao/` — Contains the database logic
- `view/` — Contains the console-based view
- `controller/` — Contains the controller logic
- `lib/` — Place the MySQL Connector/J JAR here
- `Main.java` — Entry point for the application

## Setup Instructions

1. Download the MySQL Connector/J from: https://dev.mysql.com/downloads/connector/j/ (Already done for you, version 8.4.0).
2. Extract the JAR file and place it in the `lib/` folder. (Already done)
3. Update your database credentials in `model/DatabaseConnectivity.java`.
4. Compile the project:

```powershell
javac -cp ".;lib/mysql-connector-java-8.4.0.jar" Main.java model/*.java controller/*.java view/*.java
```

5. Run the application:

```powershell
java -cp ".;lib/mysql-connector-java-8.4.0.jar" Main
```
## Pre-requisites

1. Make sure there is MySQL 5.X.X is installed on your system.
2. Make sure latest jdk is installed in your system and it's bin path should be in your class path.


## Database

Run the following query to create a MySQL database:
```sql
CREATE DATABASE library;
```


### Create Table

Create a table in your MySQL database:

```sql
USE library;

CREATE TABLE student (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(100),
  age INT
);
```
