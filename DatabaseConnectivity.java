package com.java.mini_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnectivity {

	public void getConnectivity() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root",
					"root");
			PreparedStatement preparedStatement = connection.prepareStatement("Select * from question");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println("id::" + resultSet.getInt(1));
                System.out.println("Questions>>" + resultSet.getString(2));
				System.out.println("Opeation A::" + resultSet.getString(3));
				System.out.println("Opeation B::" + resultSet.getString(4));
				System.out.println("Opeation C::" + resultSet.getString(5));
				System.out.println("Opeation D::" + resultSet.getString(6));

			}
			connection.close();
			preparedStatement.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
