import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CommitAndRollback {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/DBConnect";
        String USERNAME = "root";
        String PASSWORD = "root";

         Connection conn = null;
        try {
            
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);

            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);

            conn.setAutoCommit(false);

            PreparedStatement ps1 = conn.prepareStatement("INSERT INTO Users (id, name) VALUES (?,?)");

            ps1.setInt(1, 16);
            ps1.setString(2,"Vishal");
            ps1.executeUpdate();

            PreparedStatement ps2 = conn.prepareStatement("INSERT INTO Users (id, name) VALUES (?,?)");

            ps2.setInt(1, 17);
            ps2.setString(2,"Harshal");
            ps2.executeUpdate();

            conn.commit();
            System.out.println("Execution Successful! Data Saved.");

        } catch (Exception e) {

            try {
                if (conn != null) {
                    conn.rollback();
                     System.out.println("Execution Failed! Changes Rolled Back.");
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException exc) {
                exc.printStackTrace();
            }
        }
    }
}