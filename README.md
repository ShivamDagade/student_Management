# 🎓 Student Management System

A simple **console-based Java application** that allows you to manage student records using standard Java collections (`List`). This mini project demonstrates object-oriented principles such as encapsulation and modular design, and includes functionalities like adding, updating, displaying, and deleting students.

---

## 📋 Features

- ➕ Add New Student  
- 📝 Update Existing Student  
- 📃 Display All Students  
- ❌ Delete Student by ID  
- 🚪 Exit the Application

---

## 🧱 Project Structure

```bash
studentManagement/
├── Student.java          # Student data model (POJO)
├── StudentUtility.java   # Contains all student-related operations
└── StudentTest.java      # Main class with menu-driven user interface
````

---

## 🔍 Class Overview

### ✅ `Student.java`

* Represents the **Student** entity with:

  * `sId`: Student ID
  * `sName`: Student Name
  * `sAge`: Student Age
* Includes constructors, getters, setters, and `toString()` method.

---

### ✅ `StudentUtility.java`

* Provides utility methods:

  * `addStudent()`: Input and return a new `Student` object
  * `updateStudent(List<Student>)`: Modify an existing student record
  * `displayAllStudents(List<Student>)`: Print all students
  * `deleteStudent(List<Student>, int sid)`: Delete student by ID

---

### ✅ `StudentTest.java`

* Main driver class with a **menu-based interface**
* Runs in a loop until the user chooses to exit
* Uses `ArrayList<Student>` to manage records in memory

---

## 🚀 How to Run

### ✅ Using Command Line

1. **Compile the files**:

```bash
javac studentManagement/*.java
```

2. **Run the application**:

```bash
java studentManagement.StudentTest
```

---

## 💡 Sample Menu Output

```text
        Student Project Management
========================================================
1. Add Student
2. Update Student
3. Display All Students
4. Delete Student
5. Exit

Please Select Operation:
```

---

## 🧠 Example Student Format

```text
Student [sId = 101 , sName = Alice, sAge = 21]
```

---

## 🛠️ Requirements

* Java JDK 8 or higher
* Terminal/IDE (e.g., IntelliJ, Eclipse, or VS Code with Java support)

---

## ✅ Future Improvements (Optional)

* Add validation for input fields
* Persist data using file storage or database (JDBC)
* Add support for student marks or subjects
* Create a GUI using JavaFX or Swing
