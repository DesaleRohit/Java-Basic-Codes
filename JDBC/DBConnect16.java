import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnect16 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/DBConnect";
        String user = "root";      
        String password = "root"; 

        try {
            // Step 1: Load the Driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully using Class.forName()");

            // Step 2: Establish the Connection
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Established Successfully");

            // Step 3: Create a Statement
            Statement statement = connection.createStatement();
            System.out.println("Statement Object Created");

            // Step 4: Execute a Query
            ResultSet rs = statement.executeQuery("SELECT * FROM Users");
            System.out.println("Query Executed Successfully\n");
            System.out.println("ID\tName");

            // Step 5: Display Results
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" + rs.getString("name"));
            }
            
            // Step 6: Close Connection
            connection.close();
            System.out.println("Connection Closed");

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver class not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}
