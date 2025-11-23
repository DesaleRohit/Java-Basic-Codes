import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Type_Scroll_Insensitive {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/DBConnect";
        String USERNAME = "root";
        String PASSWORD = "root";

        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);

            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);

            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            ResultSet rs = statement.executeQuery("SELECT * FROM Users");

            while(rs.next()) {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
              }

            //Access first row
            rs.first();
            System.out.println("FIRST: " + rs.getInt("id") + " | " + rs.getString("name"));
            
            //Access last row
            rs.last();
            System.out.println("Last: "+rs.getInt("id") + " | " + rs.getString("name"));

            //Access previou row
            rs.previous();
            System.out.println("Previous: "+rs.getInt("id") + " | " + rs.getString("name"));

            // ABSOLUTE ROW 2
            rs.absolute(2);
            System.out.println("ROW 2: " + rs.getInt("id") + " | " + rs.getString("name"));

            // NEXT ROW
            rs.next();
            System.out.println("NEXT: " + rs.getInt("id") + " | " + rs.getString("name"));




        } catch (SQLException e) {
            System.out.println("Error to Connect Database!!");
        }
    }
}