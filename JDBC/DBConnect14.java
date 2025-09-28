
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

class DBConnect14 {

    public static void main(String[] args) {

        try {
            //Step 1. Register the Driver..
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            System.out.println("Driver Registred Succesfully..");

            //Step 2. Get Connection..
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBConnect", "root", "root");
            System.out.println("Connection is OK..");
            System.out.println("Connection ID : " +connection);

            //Step 3.Create Statement Object...
            Statement stm = connection.createStatement();
            System.out.println("Statement object created..");
            
            //Step 4. Execute the Query..
           ResultSet rs = stm.executeQuery("Select * from Users");
           rs.next();
           System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
           rs.next();
           System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
           rs.next();
           System.out.println(rs.getInt(1)+"\t"+rs.getString(2));

           //Step 5. Close the Connection
           connection.close();
           System.out.println("Connection closed..");



        } catch (SQLException e) {
            System.out.println("Error to Connect Database..");
        }

    }
}
