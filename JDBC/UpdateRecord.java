import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateRecord {
    public static void main(String[] args) {

        String URL = "jdbc:mysql://localhost:3306/DBConnect";
        String USERNAME = "root";
        String PASSWORD = "root";

        try {
            // Step 1: Register driver
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            System.out.println("Driver registered successfully...");

            // Step 2: Get connection
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection successful...");

            // Step 3: Create PreparedStatement
            PreparedStatement pst = connection.prepareStatement("UPDATE Users SET name=? WHERE id=?"); 
            System.out.println("PreparedStatement created...");

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter ID to update name: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter new name: ");
            String newName = scanner.nextLine();

            // Set values
            pst.setString(1, newName);
            pst.setInt(2, id);

            // Execute update
            int row = pst.executeUpdate();

            if (row > 0) {
                System.out.println("Record Updated Successfully.");
            } else {
                System.out.println("ID Not Found.");
            }

            // Close connection
            connection.close();

        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }
    }
}
