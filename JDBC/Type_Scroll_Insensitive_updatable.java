import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet; 

public class Type_Scroll_Insensitive_updatable {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/DBConnect";
        String USERNAME = "root";
        String PASSWORD = "root";
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);

           Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);

            PreparedStatement ps = connection.prepareStatement(
                    "SELECT id, name FROM Users",
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE   // <-- Updatable
            );

            ResultSet rs = ps.executeQuery();

            // Move to row 2 
            rs.absolute(2);

            System.out.println("Before Update:");
            System.out.println(rs.getInt("id") + " | " + rs.getString("name"));

            // Update the name in ResultSet
            rs.updateString("name", "5wapnill");  
            rs.updateRow(); 

            System.out.println("\nAfter Update:");
            System.out.println(rs.getInt("id") + " | " + rs.getString("name"));

            connection.close();

        } catch (SQLException e) {
            System.out.println("Error to Connect Database");
            e.printStackTrace();
        }
    }
}