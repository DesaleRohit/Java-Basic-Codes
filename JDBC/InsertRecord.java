import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRecord {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/DBConnect";
        String USERNAME = "root";
        String PASSWORD = "root";

        int id = 13;
        String name = "Raj";

        try {
            // Step 1: Register the Driver
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            System.out.println("Driver Registered Successfully..");

            // Step 2: Get Connection
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection Successful...");

            // Step 3: Create PreparedStatement
            PreparedStatement pst = connection.prepareStatement("INSERT INTO Users (id, name) VALUES (?, ?)");

            pst.setInt(1, id);
            pst.setString(2, name);

            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Record Inserted Successfully.");
            } else {
                System.out.println("Failed to Insert Record.");
            }

            // Step 4: Close connection
            pst.close();
            connection.close();
            System.out.println("Connection Closed.");

        } catch (SQLException e) {
            System.out.println("Error Connecting to Database");
            e.printStackTrace();
        }
    }
}
