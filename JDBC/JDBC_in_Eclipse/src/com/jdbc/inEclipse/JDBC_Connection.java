package com.jdbc.inEclipse;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection {

	public static void main(String[] args) {
		
		try {
		//Step 1. Register the Driver..
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		System.out.println("Registered Driver Succesfully..");
		
		//Step 2. Get Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBConnect","root","root");
		System.out.println("Connection Ok... Connection ID : "+connection);
		
		//Step 3. Create Statement Object..
		Statement statement = connection.createStatement();
		System.out.println("Statement Object Created..");
		
		 //Step 4. Execute the Query..
		statement.executeUpdate("insert into Users values(12,'Gaurav')");
		System.out.println("Query Executed...");
		 
		} catch (SQLException e) {
			System.out.println("Error to Connect DataBase");
		}

	}

}
