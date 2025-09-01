import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class DBConnect3 {
    public static void main(String[] args) {

        try {
             //Step 1. Register the Driver..
              Driver driver = new com.mysql.cj.jdbc.Driver();
              DriverManager.registerDriver(driver);
              System.out.println("Driver Registered Succesfully!!");

             //Step 2. Get Connection..
              Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
              System.out.println("Connection ID ---> "+connection);
              System.out.println("Connection is ok");
              

            //Step 3. Create Statement Object..
             Statement statement = connection.createStatement();
             System.out.println("Statement object created..");

        } catch (SQLException e) {
             System.out.println("Error in Database Connection..");
        }
    }
}