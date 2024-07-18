//Delete and Update the record from Employee
package Lab_JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class ManageEmployeeRecords {
    // JDBC URL, username and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306/your_database"; // Replace 'your_database' with your actual database name
    private static final String USER = "your_username"; // Replace 'your_username' with your actual database username
    private static final String PASSWORD = "your_password"; // Replace 'your_password' with your actual database password

    // JDBC variables for opening and managing connection
    private static Connection connection;

    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL JDBC Driver Registered!");

            // Establish a connection to the database
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection established successfully!");

            // ========== Update an Employee Record ==========

            // Create a SQL statement to update a record in the Employee table
            String updateSQL = "UPDATE Employee SET SALARY = ? WHERE NAME = ?";

            // Create a PreparedStatement object to execute the SQL statement
            PreparedStatement updateStatement = connection.prepareStatement(updateSQL);

            // Set the values for the prepared statement (Update John Doe's salary)
            updateStatement.setBigDecimal(1, new java.math.BigDecimal("80000.00")); // New salary
            updateStatement.setString(2, "John Doe"); // Employee name to identify the record to update

            // Execute the SQL statement to update the record
            int rowsUpdated = updateStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee salary updated successfully!");
            }

            // ========== Delete an Employee Record ==========

            // Create a SQL statement to delete a record from the Employee table
            String deleteSQL = "DELETE FROM Employee WHERE NAME = ?";

            // Create a PreparedStatement object to execute the SQL statement
            PreparedStatement deleteStatement = connection.prepareStatement(deleteSQL);

            // Set the value for the prepared statement (Delete John Doe from Employee)
            deleteStatement.setString(1, "John Doe"); // Employee name to identify the record to delete

            // Execute the SQL statement to delete the record
            int rowsDeleted = deleteStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Employee deleted successfully!");
            }

            // ========== Retrieve Employee Data after Update and Delete ==========

            // Create a SQL statement to retrieve data from the Employee table
            String selectSQL = "SELECT * FROM Employee";

            // Create a Statement object to execute the SQL statement
            Statement selectStatement = connection.createStatement();

            // Execute the SQL statement and get the result set
            ResultSet resultSet = selectStatement.executeQuery(selectSQL);

            // Process the result set
            System.out.println("Employee Data after operations:");
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("NAME");
                String department = resultSet.getString("DEPARTMENT");
                double salary = resultSet.getDouble("SALARY");

                // Print the retrieved data
                System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found. Include it in your library path.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed! Check output console");
            e.printStackTrace();
        } finally {
            // Close the connection to release the resources
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
 * Dry Run
 * MySQL JDBC Driver Registered!
Connection established successfully!
Employee salary updated successfully!
Employee deleted successfully!
Employee Data after operations:
ID: 2, Name: Jane Smith, Department: Marketing, Salary: 60000.0
ID: 3, Name: Michael Johnson, Department: HR, Salary: 55000.0
Connection closed.

 * 
 * 
 */

