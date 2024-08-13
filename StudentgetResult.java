package com.java.mini_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentgetResult {
	public void studentfirstResultGet() throws SQLException {
		try {
			   System.out.println("Enter the Student name");
			   Scanner scanner = new Scanner(System.in);
			   String studentname=scanner.nextLine();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root",
					"root");
			 PreparedStatement statement= connection.prepareStatement("select NumRightQue from displayresult where Student_Name='Ram Patil'");
			                    ResultSet resultset=statement.executeQuery();
			                    while(resultset.next()) {
			                    	
			                    	System.out.println("Your Score is::"+resultset.getInt(1));
			                    }
			                    connection.close();
			                    statement.close();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	
	}
	public void studentsecondResultGet() throws SQLException {
		try {
			   System.out.println("Enter the Student name Two");
			   Scanner scanner = new Scanner(System.in);
			   String studentname=scanner.nextLine();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root",
					"root");
			 PreparedStatement statement= connection.prepareStatement("select NumRightQue from displayresult where Student_Name='Vishal Deshmukh'");
			                    ResultSet resultset=statement.executeQuery();
			                    while(resultset.next()) {
			                    	
			                    	System.out.println("Your Score is::"+resultset.getInt(1));
			                    }
			                    connection.close();
			                    statement.close();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	
	}
	
	public void studentThirdResultGet() throws SQLException {
		try {
			   System.out.println("Enter the Student name Three");
			   Scanner scanner = new Scanner(System.in);
			   String studentname=scanner.nextLine();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root",
					"root");
			 PreparedStatement statement= connection.prepareStatement("select NumRightQue from displayresult where Student_Name='Dinesh Kamble'");
			                    ResultSet resultset=statement.executeQuery();
			                    while(resultset.next()) {
			                    	
			                    	System.out.println("Your Score is::"+resultset.getInt(1));
			                    }
			                    connection.close();
			                    statement.close();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	
	}
	
}
