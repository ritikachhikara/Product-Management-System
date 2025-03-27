🛒 Product Management System
📚 Project Overview
The Product Management System is a Java-based application that provides seamless CRUD (Create, Read, Update, Delete) operations for managing various product categories. The system integrates core Java with the Collection Framework, JDBC, and MySQL to ensure efficient data handling and retrieval.

🚀 Features
CRUD Operations: Perform basic operations like adding, viewing, updating, and deleting product records.

Dynamic Search and Sorting: Search and filter products by attributes such as:

Price

Category

Name

Input Validation: Ensures that only valid data is entered by the user to prevent data inconsistencies.

Scalable Architecture: Designed to handle large datasets with optimized query execution and minimal latency.

🛠️ Technologies Used
Java: Core programming language for implementing business logic.

Collection Framework: Used for storing and manipulating in-memory data efficiently.

JDBC (Java Database Connectivity): Facilitates seamless interaction between Java and MySQL.

MySQL: Relational database used for persistent data storage.

📁 Project Structure
pgsql
Copy
Edit
/ProductManagementSystem
├── /src
│   ├── Main.java                 # Entry point of the application
│   ├── Product.java              # Product entity class
│   ├── ProductDAO.java           # Data Access Object (DAO) for database operations
│   ├── DatabaseConnection.java   # Handles MySQL connection using JDBC
│   └── Utils.java                # Utility class for input validation and sorting
├── /resources
│   └── database.sql              # SQL script to create and populate tables
└── /README.md                    # Project documentation
🎯 How to Run the Project
Clone the Repository:

bash
Copy
Edit
git clone https://github.com/your-username/product-management-system.git
Set Up the Database:

Create a database named product_db in MySQL.

Run the database.sql script located in the resources folder to create the necessary tables.

Configure Database Connection:

Update the DatabaseConnection.java file with your MySQL credentials:

java
Copy
Edit
String url = "jdbc:mysql://localhost:3306/product_db";
String user = "your_username";
String password = "your_password";
Compile and Run:

bash
Copy
Edit
javac Main.java
java Main
📊 Database Schema
sql
Copy
Edit
CREATE TABLE products (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    category VARCHAR(50),
    price DECIMAL(10, 2),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
🔍 Future Enhancements
Add user authentication and role-based access.

Implement RESTful APIs for external integrations.

Create a GUI-based interface using Java Swing or JavaFX.
