import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

class DBConnect11 {
    public static void main(String[] args) {

        try {
            //Step 1.Register the Driver..
             Driver driver = new com.mysql.cj.jdbc.Driver();
             DriverManager.registerDriver(driver);
             System.out.println("Driver Registred Succesfully..");

             //Step 2. get Connection..
             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBConnect","root","root");
             System.out.println("Connection is OK..");

             //Step 3. Create statement object..
             Statement statement = connection.createStatement();
             System.out.println("Statement object created..");

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
             
        } catch (SQLException e) {
            System.out.println("Error to Connect Database..");
        }
       
    }
}