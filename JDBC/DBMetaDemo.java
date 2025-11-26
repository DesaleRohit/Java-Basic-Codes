import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBMetaDemo {
    public static void main(String[] args) {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully!");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBConnect","root", "root");
            System.out.println("Connection Created Successfully!");

            DatabaseMetaData meta = connection.getMetaData();
            System.out.println("DB Product Name : " + meta.getDatabaseProductName());
            System.out.println("DB Version : " + meta.getDatabaseProductVersion());
            System.out.println("DB Major Version : " + meta.getDatabaseMajorVersion());
            System.out.println("DB Minor Version : " + meta.getDatabaseMinorVersion());
            System.out.println("JDBC Driver Version : " + meta.getJDBCMajorVersion() + " - " + meta.getJDBCMinorVersion());

            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM Users");

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
