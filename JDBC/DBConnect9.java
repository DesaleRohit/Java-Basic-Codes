import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

class DBConnect9 {
    public static void main(String[] args) {

        try {
             //Step 1. Register the Driver..
              Driver driver = new com.mysql.cj.jdbc.Driver();
              DriverManager.registerDriver(driver);
              System.out.println("Driver registred succesfully..");

              //Step 2. Get Connection..
              Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBConnect","root","root");
              System.out.println("Connection id Ok..");

              //Step 3. Create Statement object..
              Statement statement = connection.createStatement();
              System.out.println("Statement Object created..");

              //Step 4. Execute the Query..
              ResultSet rs = statement.executeQuery("Select * from Users");
              System.out.println("Query Exucuted..");
              System.out.println("ID\tName");

              while(rs.next()) {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
              }

            //Step 5. Close the connection...
            connection.close();
            System.out.println("Connection closed...");
            
          } catch (SQLException e) {
              System.out.println("Error to connect database..");
          }

       

    }
}