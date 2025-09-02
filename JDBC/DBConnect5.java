import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class DBConnect5 {
    public  static void main(String[] args) {

        try {
        //Step 1. Register the Driver..
        Driver driver = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(driver);
        System.out.println("Driver register succesfully..");

       //Step 2. Get Connection..
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBConnect","root","root");
        System.out.println("Connection is Ok..");

        //Step 3. Create Statement Object..
        Statement statement = connection.createStatement();
        System.out.println("Statement Object Created..");


        //Step 4. Execute the Query..
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Name and ID : ");
        int id = scanner.nextInt();
        String name = scanner.next();

        statement.executeUpdate("insert into Users values("+id+",'"+name+"')");
        System.out.println("Query Executed Succesfully");

        //Step 5. Close the connection..
        connection.close();
        System.out.println("Connection Closed..");

        } catch (SQLException e) {
            System.out.println("Error to connect database..");
        }
    }
}