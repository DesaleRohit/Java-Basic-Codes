import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DBConnect2 {
    public static void main(String[] args) {

        try {
             //Step 1. Register the Driver..
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            System.out.println("Driver registered succsesfully..");

            //Step 2: Get Connection...
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
            System.out.println("Connected succsefully..");

        } catch (SQLException e) {
            System.out.println("Error in Driver Connection..");
        } 
    }
}