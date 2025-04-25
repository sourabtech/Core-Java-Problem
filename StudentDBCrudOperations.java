package com.anudip.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDBCrudOperations {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // Step 1: Loading the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 2: Establishing a database connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hiberdb", "root", "root");

        // Step 3: Creating a Statement
        Statement stmt = connection.createStatement();

        // Scanner class to take input from user
        Scanner sc = new Scanner(System.in);

        // Integer input for variable operation
        int operation;

        do {
            // Display menu for CRUD operations
            System.out.println("Available Operations:");
            System.out.println("1. Create");
            System.out.println("2. Retrieve");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");

            // Prompts user to enter an operation number
            System.out.print("Please Enter an Operation number you want to Perform: ");

            operation = sc.nextInt();

            // Consume newline
            sc.nextLine();

            // Use a switch statement to perform different actions based on the user's choice
            switch (operation) {

                // Create operation: Add a new student record to the database
                case 1:
                    // Prompt for and collect student information
                    System.out.print("Enter student first name: ");
                    String firstName = sc.nextLine();
                    System.out.print("Enter student last name: ");
                    String lastName = sc.nextLine();
                    System.out.print("Enter student age: ");
                    int age = sc.nextInt();

                    // Consume newline
                    sc.nextLine();
                    System.out.print("Enter student grade: ");
                    String grade = sc.nextLine();

                    // SQL query for creating a new student record
                    String createSql = "INSERT INTO Students (first_name, last_name, age, grade) VALUES (?, ?, ?, ?)";

                    // Creating a PreparedStatement object for executing the SQL query.
                    try (PreparedStatement createStatement = connection.prepareStatement(createSql)) {
                        // Set the value for the first placeholder ('?') in the SQL query with the first name.
                        createStatement.setString(1, firstName);

                        // Set the value for the second placeholder ('?') in the SQL query with the last name.
                        createStatement.setString(2, lastName);

                        // Set the value for the third placeholder ('?') in the SQL query with the age.
                        createStatement.setInt(3, age);

                        // Set the value for the fourth placeholder ('?') in the SQL query with the grade.
                        createStatement.setString(4, grade);

                        // Execute the SQL query and get the number of rows affected in the database.
                        int rowsAffected = createStatement.executeUpdate();

                        // Check if any rows were affected (record added successfully) and provide appropriate feedback.
                        if (rowsAffected > 0) {
                            System.out.println("Student added successfully.");
                        } else {
                            System.out.println("Failed to add student.");
                        }
                    }
                    // End of try-with-resources block for PreparedStatement
                    // jump out of the switch statement after completing the insert operation.
                    break;

                case 2:
                    // Read operation: Retrieve and display student records from the database
                    String readSql = "SELECT * FROM Students";

                    // Creating a Statement object for executing the SQL query.
                    try (Statement readStatement = connection.createStatement()) {
                        // Execute the SQL query and obtain a ResultSet containing the results.
                        ResultSet resultSet = readStatement.executeQuery(readSql);

                        // While Loop through the ResultSet to extract and display student information.
                        while (resultSet.next()) {
                            // Extract and display student information
                            int studentId = resultSet.getInt("student_id");
                            String studentFirstName = resultSet.getString("first_name");
                            String studentLastName = resultSet.getString("last_name");
                            int studentAge = resultSet.getInt("age");
                            String studentGrade = resultSet.getString("grade");

                            // Display the extracted student information
                            System.out.println("ID: " + studentId + ", Name: " + studentFirstName + " " + studentLastName + ", Age: " + studentAge + ", Grade: " + studentGrade);
                        }
                    }
                    // Jump out of the switch statement after completing the read operation.
                    break;

                case 3:
                    // Update operation: Modify student records (name, age, or grade)
                    // Prompt for student ID and update choice
                    System.out.print("Enter student ID to update: ");
                    int studentIdToUpdate = sc.nextInt();

                    // Consume newline character
                    sc.nextLine();

                    // Display options for what the user can update
                    System.out.println("Choose what to update:");
                    System.out.println("1. Update name");
                    System.out.println("2. Update age");
                    System.out.println("3. Update grade");

                    // Prompts to user to enter a choice
                    System.out.print("Enter your choice: ");
                    int updateChoice = sc.nextInt();
                    // Consume newline
                    sc.nextLine();

                    String updateSql;
                    PreparedStatement updateStatement;

                    // Use a switch statement to handle different update choices
                    switch (updateChoice) {
                        case 1:
                            // Update name
                            System.out.print("Enter new first name: ");
                            String newFirstName = sc.nextLine();
                            System.out.print("Enter new last name: ");
                            String newLastName = sc.nextLine();

                            // SQL query to update name
                            updateSql = "UPDATE Students SET first_name = ?, last_name = ? WHERE student_id = ?";

                            updateStatement = connection.prepareStatement(updateSql);
                            updateStatement.setString(1, newFirstName);
                            updateStatement.setString(2, newLastName);
                            break;

                        case 2:
                            // Update age
                            System.out.print("Enter new age: ");
                            int newAge = sc.nextInt();

                            // SQL query to update age
                            updateSql = "UPDATE Students SET age = ? WHERE student_id = ?";

                            updateStatement = connection.prepareStatement(updateSql);
                            updateStatement.setInt(1, newAge);

                            break;

                        case 3:
                            // Update grade
                            sc.nextLine(); // Consume newline
                            System.out.print("Enter new grade: ");
                            String newGrade = sc.nextLine();

                            // SQL query to update grade
                            updateSql = "UPDATE Students SET grade = ? WHERE student_id = ?";
                            updateStatement = connection.prepareStatement(updateSql);
                            updateStatement.setString(1, newGrade);
                            break;

                        default:
                            System.out.println("Invalid choice for update. Please try again.");
                            // Continue the loop to re-enter the update operation
                            continue;
                    }

                    // Set student ID and execute the update query
                    updateStatement.setInt(2, studentIdToUpdate);
                    int rowsAffected = updateStatement.executeUpdate();
                    // Check if the update was successful and provide feedback
                    if (rowsAffected > 0) {
                        System.out.println("Student updated successfully.");
                    } else {
                        System.out.println("Student not found or update failed.");
                    }
                    break;

                case 4:
                    // Delete operation: Remove a student record from the database
                    // Prompt for student ID to delete
                    System.out.print("Enter student ID to delete: ");

                    int studentIdToDelete = sc.nextInt();

                    // SQL query to delete a student record
                    String deleteSql = "DELETE FROM Students WHERE student_id = ?";
                    try (PreparedStatement deleteStatement = connection.prepareStatement(deleteSql)) {
                        deleteStatement.setInt(1, studentIdToDelete);
                        int rowsAffected1 = deleteStatement.executeUpdate();
                        if (rowsAffected1 > 0) {
                            System.out.println("Student deleted successfully.");
                        } else {
                            System.out.println("Student not found or delete failed.");
                        }
                    }
                    // Jump out of the switch statement after completing the update operation
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Exiting program.");
                    // Jump out of the loop
                    break;

                default:
                    // Handles any invalid user input.
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        // This loop continues as long as the user's choice (operation) is not equal to 5.
        while (operation != 5);

        // Close the Scanner used for user input.
        sc.close();
        // Close a Statement object
        stmt.close();
        // Close the database connection.
        connection.close();
    }
}
