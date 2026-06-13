# Mero Khata - ATM Simulation Software

Mero Khata is a Java Swing-based ATM Simulation System developed using Java, MySQL, and JDBC. The application provides core banking functionalities such as account creation, deposits, withdrawals, balance enquiry, PIN changes, and mini statements through a desktop graphical user interface.

## Features

- User Registration
- Secure Login
- Deposit Money
- Withdraw Money
- Fast Cash Transactions
- Balance Enquiry
- Mini Statement
- PIN Change
- Transaction History

## Technologies Used

- Java Swing
- Java JDBC
- MySQL Database
- NetBeans IDE
- JCalendar Library
- MySQL Connector/J

## Project Structure

```
MeroKhata
│
├── src/
│   ├── Login.java
│   ├── SignupOne.java
│   ├── SignupTwo.java
│   ├── Signupthree.java
│   ├── Deposit.java
│   ├── Withdrawl.java
│   ├── FastCash.java
│   ├── BalanceEnquiry.java
│   ├── MiniStatement.java
│   ├── PinChange.java
│   ├── Transaction.java
│   └── connection.java
│
├── lib/
├── Mero_khata.jar
└── README.md
```

## Requirements

### Software

- Java JDK 21 or later
- MySQL Server 8.0+
- MySQL Workbench (Optional)
- NetBeans IDE (Optional)

### Required Libraries

- mysql-connector-java-8.0.28.jar
- jcalendar-tz-1.3.3-4.jar

## Database Setup

### Step 1: Install MySQL Server

Download and install MySQL Server.

### Step 2: Create Database

Open MySQL Workbench and execute:

```sql
CREATE DATABASE merokhata;
USE merokhata;
```

### Step 3: Import Database

Import the provided:

```text
merokhata.sql
```

using:

```
Server → Data Import
```

### Step 4: Configure Database Credentials

Open:

```java
connection.java
```

Update the connection details if required:

```java
c = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/merokhata",
    "root",
    "your_password"
);
```

## Running the Application

### Option 1: Run JAR

Navigate to the project folder:

```bash
java -jar Mero_khata.jar
```

### Option 2: Run EXE

Double-click:

```text
MeroKhata.exe
```

or execute:

```bash
MeroKhata.exe
```

## Important Notes

- MySQL Server must be running before starting the application.
- The database name must be:

```text
merokhata
```

- Ensure the database username and password match the values configured in `connection.java`.
- Required library files must remain inside the `lib` folder.

## Troubleshooting

### Application Does Not Start

Verify:

- Java is installed.
- MySQL Server is running.
- Database exists.
- JDBC driver is present in the `lib` folder.

### Database Connection Error

Check:

```java
jdbc:mysql://localhost:3306/merokhata
```

and verify MySQL credentials.

## Author

Khushi Kumari Sah

B.Tech Computer Science Engineering

## License

This project is intended for educational and learning purposes.
