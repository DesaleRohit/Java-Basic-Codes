package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample { 
	final static String URL = "jdbc:mysql://localhost:3306/DBConnect";
    final static String USERNAME = "root";
    final static String PASSWORD = "root";
    
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try {
            // Step 1. Load and Register the driver
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            // Step 2. Get connection
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connected to database!!!");
            
            // Step 3. Create Statement
            statement = connection.createStatement();
            
            // Step 4. Execute the Query
            resultSet = statement.executeQuery("SELECT * FROM users");
            
            // Step 5. Process results
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                
                System.out.println("ID: " + id + "  Name: " + name);
            }             
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver Not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        } finally {
           
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    } 
} 