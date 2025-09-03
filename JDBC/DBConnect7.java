import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

class DBConnect7 {
    public static void main(String[] args) {
        try {
            // Step 1. Register the Driver..
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            System.out.println("Driver Registered Successfully..");

            // Step 2. Get Connection..
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBConnect", "root", "root");
            System.out.println("Connection ID : " + connection);
            System.out.println("Connection is Ok..");

            // Step 3. Create Statement Object..
            PreparedStatement pstm = connection.prepareStatement("INSERT INTO Users VALUES(?, ?)");
            System.out.println("PreparedStatement object created..");

            // Step 4. Execute the Query..
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the ID and Name :");

            int id = scanner.nextInt();
            String name = scanner.next();

            pstm.setInt(1, id);
            pstm.setString(2, name);

            pstm.executeUpdate();
            System.out.println("Query Executed..");

            // Step 5. Close the Connection..
            connection.close();
            System.out.println("Connection Closed..");

        } catch (SQLException e) {
            System.out.println("Error to Connect Database: " + e.getMessage());
        }
    }
}
