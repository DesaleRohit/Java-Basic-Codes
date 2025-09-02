import java.sql.Driver;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class DBConnect4 {
    public static void main(String[] args) {

        try {

        //Step 1. Register the Driver..
         Driver driver = new com.mysql.cj.jdbc.Driver();
         DriverManager.registerDriver(driver);
         System.out.println("Driver Registered succesfully..");

        //Step 2. Get Connection..
         Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/DBConnect","root","root");
         System.out.println("Connection ID --> "+connection);
         System.out.println("Connection is Ok..");

        //Step 3. Create Statement Object..
         Statement statement = connection.createStatement();
         System.out.println("Statement Object Created..");

        //Step 4. Execute the Query..
         statement.executeUpdate("create database DBConnect");
         System.out.println("DataBase Created...");

         statement.executeUpdate("create table Users (id INT(5), name VARCHAR(60))");
         System.out.println("Table Created...");

         statement.executeUpdate("insert into Users values(1,'Rohit')");
         System.out.println("Data Inserted...");

         //Step 5. Close the Connection..
         connection.Close();
         System.out.println("Connection is closed..");


        } catch (SQLException e) {
            System.out.println("Error to Connect database..");
        }

    }
}