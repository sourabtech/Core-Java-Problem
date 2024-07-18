// Retrieve the data using JDBC for Employee
package Lab_JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveEmployeeData {
    // JDBC URL, username and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306/hiberdb"; // Replace 'your_database' with your actual database name
    private static final String USER = "root"; // Replace 'your_username' with your actual database username
    private static final String PASSWORD = "root"; // Replace 'your_password' with your actual database password

    // JDBC variables for opening and managing connection
    private static Connection connection;

    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL JDBC Driver Registered!");

            // Establish a connection to the database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hiberdb", "root", "root");
            System.out.println("Connection established successfully!");

            // Create a SQL statement to retrieve data from the Employee table
            String selectSQL = "SELECT * FROM Employee";

            // Create a Statement object to execute the SQL statement
            Statement statement = connection.createStatement();

            // Execute the SQL statement and get the result set
            ResultSet resultSet = statement.executeQuery(selectSQL);

            // Process the result set
            System.out.println("Employee Data:");
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
Employee Data:
ID: 1, Name: John Doe, Department: Engineering, Salary: 75000.0
Connection closed.

 * 
 */
