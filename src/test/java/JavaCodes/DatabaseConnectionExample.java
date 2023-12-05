package JavaCodes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseConnectionExample {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/employees";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";

    public static void main(String[] args) {
        // Establish a connection
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            System.out.println("Connected to the database!");

            // Perform database operations here if needed
            performDatabaseOperations(connection);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void performDatabaseOperations(Connection connection) throws SQLException {
        // Example: Execute a query
       // String query = "SELECT * FROM your_table_name";
        
    	String query= "select hire_date from employees.employees where first_name='Anneke' LIMIT 1";	
    	
    	try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            // Process the result set
            while (resultSet.next()) {
                String columnName = resultSet.getString("hire_date");
                // Process data as needed
                System.out.println(columnName);
            }
        }
    }
}



/*
*   Make sure to replace "jdbc:mysql://localhost:3306/your_database_name",
*  "your_username", "your_password", "your_table_name", and "column_name" 
*   with your actual database URL, username, password, table name, and column name
*/


/*
Ensure that you have the JDBC driver for your database included in your project.
Download the appropriate JDBC driver (for example, MySQL Connector/J for MySQL) 
and add it to your project's classpath.

If you are using Maven, you can add the dependency in your pom.xml:
*/


//Connection: set up database connection
//preparedStatement :execute query
//ResultSet : to store results