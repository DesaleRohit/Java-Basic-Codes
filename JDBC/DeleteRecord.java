import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteRecord {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/DBConnect";
        String USERNAME = "root";
        String PASSWORD = "root";

        System.out.println("####### Delete Operation using JDBC #######");

        try {
            // Step 1: Register JDBC driver
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            System.out.println("Driver registered successfully.");

            // Step 2: Get connection
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection successful.");

            // Step 3: Create PreparedStatement
            PreparedStatement pst = connection.prepareStatement("DELETE FROM Users WHERE id=?");
            System.out.println("PreparedStatement created.");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter ID to delete: ");
            int id = scanner.nextInt();
            scanner.close();

            // Step 4: Set parameter
            pst.setInt(1, id);

            // Step 5: Execute query
            int row = pst.executeUpdate();
            if (row > 0) {
                System.out.println("Record deleted successfully.");
            } else {
                System.out.println("No record found with this ID.");
            }

            // Step 6: Close connection
            connection.close();
            System.out.println("Connection closed.");
            System.out.println("######### Program End #########");

        } catch (SQLException e) {
            System.out.println("Error connecting to database!");
            e.printStackTrace();
        }
    }
}
