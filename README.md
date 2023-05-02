# ToDo List with Java and SQL

This is a simple ToDo list application built using Java and SQL. The application allows users to manage their daily tasks by adding, editing, and deleting tasks, as well as marking tasks as complete.

## Features
- Add, edit, and delete tasks
- Mark tasks as complete
- SQL database integration

## Technologies Used
- Java
- JDBC
- SQL
- DAO Design Pattern

## Getting Started
To run the ToDo List application, you'll need to have the following software installed on your machine:
- Java 8 or later
- MySQL

### Setup Instructions
1. Clone this repository to your local machine.
2. Import the project into your preferred Java IDE (e.g. IntelliJ IDEA, Eclipse).
3. Create a MySQL database and table to store your tasks. You can use the following SQL commands to create a simple `tasks` table:
```
CREATE DATABASE todo_list;
USE todo_list;
CREATE TABLE todo-list (
id INT NOT NULL AUTO_INCREMENT,
todo VARCHAR(255) NOT NULL,
completed BOOLEAN NOT NULL,
PRIMARY KEY (id)
);
```

4. Update the `src/main/resources/application.properties` file with your MySQL database connection details:
   spring.datasource.url=jdbc:mysql://localhost/todo_list?useSSL=false
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

5. Run the application and navigate to `http://localhost:8080` to see the ToDo list in action.

## Contributing
Contributions are welcome! If you'd like to contribute to this project, please fork the repository and create a pull request with your changes.

## License
This project is licensed under the [MIT License](LICENSE). Feel free to use, modify, and distribute the code as you see fit.

## Acknowledgements
- This project was inspired by various ToDo list applications available online.
- The DAO design pattern used in this project is based on the tutorial by [Baeldung](https://www.baeldung.com/java-dao-pattern).
