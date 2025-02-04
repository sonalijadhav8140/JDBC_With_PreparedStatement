# JDBC Prepared Statement Project

## 📌 Description
A **JDBC-based** project demonstrating **Prepared Statements** for performing CRUD operations (Create, Read, Update, Delete) on a database. The project is structured into two packages:  
- **With Scanner** → Uses `Scanner` for user input.  
- **Without Scanner** → Uses predefined values for database operations.

## ⚡ Features
- **Insert Data** into the database  
- **Retrieve (Select) Data** from the database  
- **Update Records** in the database  
- **Delete Records** from the database  
- **Prepared Statement Implementation** for efficiency and security  

## 🗂 Project Structure
src/ │── withscanner/ │ ├── Insert.java │ ├── Select.java │ ├── Update.java │ ├── Delete.java │ │── withoutscanner/ │ ├── Insert.java │ ├── Select.java │ ├── Update.java │ ├── Delete.java │ └── DatabaseConnection.java


## 🛠 Technologies Used
- **Java (JDBC, Prepared Statements)**
- **MySQL (or any relational database)**
- **IDE: (Eclipse/IntelliJ/VS Code)**
- **Database Driver: MySQL Connector JAR**  

## 🚀 How to Run
1. Clone this repository:
   ```sh
   git clone https://github.com/sonalijadhav8140/JDBC_With_PreparedStatement.git
Import the project into an IDE
Add the MySQL JDBC Driver (Connector JAR) to the classpath
Update database credentials in DatabaseConnection.java
Compile and run any CRUD operation file
🔥 Example Usage (With Scanner)

Enter student ID: 101
Enter name: John
Enter age: 22
Data inserted successfully!


👤 Author
Sonali Jadhav
