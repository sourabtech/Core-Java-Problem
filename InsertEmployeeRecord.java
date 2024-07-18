//Insert the record into Employee table using JDBC 
package Lab_JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertEmployeeRecord {
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

            // Create a SQL statement to insert a record into the Employee table
            String insertSQL = "INSERT INTO Employee (NAME, DEPARTMENT, SALARY) VALUES (?, ?, ?)";

            // Create a PreparedStatement object to execute the SQL statement
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);

            // Set the values for the prepared statement
            preparedStatement.setString(1, "John Doe");
            preparedStatement.setString(2, "Engineering");
            preparedStatement.setBigDecimal(3, new java.math.BigDecimal("75000.00"));

            // Execute the SQL statement to insert the record
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new employee was inserted successfully!");
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
   A new employee was inserted successfully!
   Connection closed.
  
*/

