import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class DBConnect15 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/DBConnect";
        String user = "root";
        String password = "root";

        try {

        //Step 1. Register the Driver..
        Driver driver = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(driver);
        System.out.println("Driver Registred succesfully..");

        //Step 2. Get Connection
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("Connection is OK..");
        System.out.println("Connection ID : " +connection);

        //Step 3. Create Statement Object..
        Statement statement = connection.createStatement();
        System.out.println("Statement Object created..");

        //Step 4. Execute the Query..
        ResultSet rs = statement.executeQuery("Select * from Users");
        System.out.println("Query Executed..");
        System.out.println("\nID\tName\n");

        while (rs.next()) 
        {
          System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
        }
        //Step 5. Close the connection..
        connection.close();
        System.out.println("Connection closed..");

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}