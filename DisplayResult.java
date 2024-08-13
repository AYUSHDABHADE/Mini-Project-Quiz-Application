package com.java.mini_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayResult {

	public void getresult() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root",
					"root");
			 PreparedStatement statement= connection.prepareStatement("select NumRightQue from displayresult where idDisplayResult=9");
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
