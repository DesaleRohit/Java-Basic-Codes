import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Type_Scroll_Insensitive_updatable2 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/DBConnect";
        String USERNAME = "root";
        String PASSWORD = "root";

        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);

            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);

            PreparedStatement ps = connection.prepareStatement(
                "SELECT id, name FROM Users",
                 ResultSet.TYPE_SCROLL_INSENSITIVE,
                 ResultSet.CONCUR_UPDATABLE   
            );

            ResultSet rs = ps.executeQuery();

            rs.absolute(3);

            System.out.println("Before Update : ");
            System.out.println("ID : "+rs.getInt("id") + " | " + "Name : "+rs.getString("name"));

            rs.updateInt("id", 15);
            rs.updateRow();

            System.out.println("After Update : ");
            System.out.println("ID : "+rs.getInt("id") + " | " + "Name : "+rs.getString("name"));

            connection.close();                    

        } catch (SQLException e) {
            System.out.println("Error to Connect Database");
            e.printStackTrace();
        }
    }
}