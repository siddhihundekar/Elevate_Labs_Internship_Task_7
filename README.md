### **Elevate Labs Internship – Task 7**

### **Project: Employee Database Management using JDBC**

---

## **📌 Objective**

This project demonstrates how to connect a Java application to a **MySQL database** using **JDBC** and perform the complete set of CRUD operations:

* Add new employees
* View all employees
* Update employee details
* Delete an employee

The aim is to understand real-world **database connectivity**, **SQL queries**, and **Java OOP + JDBC integration**, which is essential for backend development.

---

## **📌 Tools & Technologies Used**

* **Java (JDK 8+)**
* **Eclipse IDE**
* **MySQL Server / XAMPP**
* **MySQL JDBC Connector**
* **Terminal / Console Output**
* **OOP Concepts**

---

## **📌 Project Structure**

```
src/
 ├── DBConnection.java     (Manages MySQL connection)
 ├── Employee.java         (Model class)
 ├── EmployeeDAO.java      (CRUD logic using JDBC)
 ├── EmployeeApp.java      (Main menu + user interaction)
```

---

## **📌 Features**

* Basic CRUD
* Insert Employee
* View All Employees
* Update Salary / Name
* Delete Employee
* Input validation (no empty fields allowed)
* Auto-display employee count
* Search employee by ID
* Clean menu-driven UI
* Graceful error handling (wrong input, DB down, etc.)
* Modular OOP structure
* Database reconnection handling
* Comments for easy understanding (beginner-friendly)

---

## **📌 How to Setup the Project**

### **1️⃣ Install MySQL**

Use XAMPP / MySQL Installer
Create database:

```
CREATE DATABASE employee_db;
```

Create table:

```
CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    department VARCHAR(100),
    salary DOUBLE
);
```

---

### **2️⃣ Add JDBC Connector JAR to Eclipse**

1. Right-click on project → **Build Path**
2. Add External Archives
3. Select `mysql-connector-j-8.xx.jar`

---

### **3️⃣ Update DB Credentials in DBConnection**

Set your own:

* username
* password
* port (default: 3306)

---

### **4️⃣ Run the Project**

Open:
```
EmployeeApp.java
```
Run the file → Menu appears → Perform operations.


