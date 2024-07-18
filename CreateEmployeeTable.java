// Create table in database using JDBC For Employee table
package Lab_JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class CreateEmployeeTable {
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
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hiberdb","root", "root");
            System.out.println("Connection established successfully!");

            // Create a SQL statement to create the Employee table
            String createTableSQL = "CREATE TABLE Employee ("
                                  + "ID INT NOT NULL AUTO_INCREMENT, "
                                  + "NAME VARCHAR(100) NOT NULL, "
                                  + "DEPARTMENT VARCHAR(100) NOT NULL, "
                                  + "SALARY DECIMAL(15, 2) NOT NULL, "
                                  + "PRIMARY KEY (ID))";

            // Create a Statement object to execute the SQL statement
            Statement statement = connection.createStatement();

            // Execute the SQL statement to create the table
            statement.executeUpdate(createTableSQL);
            System.out.println("Employee table created successfully!");

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
   Employee table created successfully!
   Connection closed.

 * 
 */
