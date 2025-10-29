package db;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import exceptions.StudentNotFoundException;

public class StudentDAO {
		
	private static final String URL = "jdbc:mysql://localhost:3306/DBConnect";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	
	public void findStudentById(int id) throws StudentNotFoundException {
		try {
			
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver Registerd successfully");
			
			
			Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("Connection is Ok");
			
			
			PreparedStatement preapredStatement = connection.prepareStatement("SELECT * FROM users WHERE id = ?");
			preapredStatement.setInt(1,id);
			ResultSet resultSet = preapredStatement.executeQuery();
			
			if (resultSet.next()) {
				System.out.println("Student Found:");
				System.out.println("ID: " + resultSet.getInt("id"));
	            System.out.println("Name: " + resultSet.getString("name"));
			} else {
				throw new StudentNotFoundException("\"Student with ID \" + id + \" not found!\"");
			}
			
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		StudentDAO student = new StudentDAO();
		try {
			student.findStudentById(0);
		} catch (StudentNotFoundException e) {
			 System.out.println("Custom Exception: " + e.getMessage());
		}
	}

}
