import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

class DBConnect12 {
    public static void main(String[] args) {
        try {
            // Step 1. Register the Driver..
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            System.out.println("Driver Registered Successfully..");

            // Step 2. Get Connection..
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/DBConnect", "root", "root");
            System.out.println("Connection ID : " + connection);
            System.out.println("Connection is Ok..");

            // Step 3. Insert Data using PreparedStatement
            PreparedStatement pstm = connection.prepareStatement("INSERT INTO Users VALUES(?, ?)");
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the ID: ");
            int id = scanner.nextInt();
            System.out.print("Enter the Name: ");
            String name = scanner.next();

            pstm.setInt(1, id);
            pstm.setString(2, name);

            int rows = pstm.executeUpdate();
            if (rows > 0) {
                System.out.println("Data inserted successfully!");
            }

            // Step 4. Retrieve Data using ResultSet
            PreparedStatement selectStmt = connection.prepareStatement("SELECT * FROM Users");
            ResultSet rs = selectStmt.executeQuery();

            System.out.println("\n--- Users Table Data ---");
            while (rs.next()) {
                int userId = rs.getInt(1);       // or rs.getInt("id")
                String userName = rs.getString(2); // or rs.getString("name")
                System.out.println("ID: " + userId + " | Name: " + userName);
            }

            // Step 5. Close the resources
            rs.close();
            selectStmt.close();
            pstm.close();
            connection.close();
            System.out.println("Connection Closed..");

        } catch (SQLException e) {
            System.out.println("Error to Connect Database: " + e.getMessage());
        }
    }
}
