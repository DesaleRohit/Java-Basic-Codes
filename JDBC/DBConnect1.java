import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect1 {
    public static void main(String args[]) {

    try {
         //Step 1 Register the Driver
          Driver driver = new com.mysql.cj.jdbc.Driver();
          DriverManager.registerDriver(driver);
          System.out.println("Driver Registered Succesfully!!");

        } catch (SQLException e) {
            //  throw new RuntimeException(e);
           System.out.println("Error in Database Connection...");
        }
    }
}                                           