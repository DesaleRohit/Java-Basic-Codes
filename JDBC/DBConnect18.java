import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DBConnect18 {
    public static void main(String[] args) {
        String URL ="jdbc:mysql://localhost:3306/DBConnect";
        String USERNAME = "root";
        String PASSWORD = "root";
        try {
            //Step 1. Register the Driver
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);

            //Step 2. Get Connection
           Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
           System.out.println("Connection is OK");

           //Step 3. Create Statement Object
           Statement statement = connection.createStatement();
           System.out.println("Statement Object created");

           //Step 4. Execute the query 
           ResultSet resulSet = statement.executeQuery("select * from users");
           System.out.println("Query executed Successfuly");
           System.out.println("ID\tName");

           while (resulSet.next()) {
                System.out.println(resulSet.getInt("id") + "\t" + resulSet.getString("name"));
           }

           connection.close();
           System.out.println("Connection Closed");

        }catch (SQLException e) {
            System.out.println("Error to Connect DB");
        }
    }
}