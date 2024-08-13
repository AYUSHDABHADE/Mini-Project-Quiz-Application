package com.java.mini_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AnswerPerson {
	public String firstanswer = "Bytecode is executed by JVM";
	public String secondanswer = "Use of pointers";
	public String thirdanswer = "Unicode escape sequence";
	public String fourthanswer = "Int";
	public String fifthanswer = "Infinity";
	public String sixthanswer = "It has no class name";
	public String sevenanswer = "java.util package";
	static int count = 0;

	private void getConnection(String fir, String sec, String third, String four, String fift, String sixt,
			String seventh) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root",
					"root");
			if (fir.equals(firstanswer)) {
				PreparedStatement statement = connection
						.prepareStatement("insert into answerremark(check_righ_or_wrong)values(?)");
				String m1 = fir.replaceFirst(fir, "True");
				statement.setString(1, m1);
				int a = statement.executeUpdate();
				System.out.println(a);
				count++;
				statement.close();
			} else if (fir != firstanswer) {
				PreparedStatement statement = connection
						.prepareStatement("insert into answerremark(check_righ_or_wrong)values(?)");
				String m1 = fir.replaceFirst(fir, "False");
				statement.setString(1, m1);
				int a = statement.executeUpdate();
				System.out.println(a);
				statement.close();
			}
			if (sec.equals(secondanswer)) {
				PreparedStatement statement = connection
						.prepareStatement("insert into answerremark(check_righ_or_wrong)values(?)");
				String m1 = sec.replaceFirst(sec, "True");
				statement.setString(1, m1);
				int a = statement.executeUpdate();
				System.out.println(a);
				count++;
				statement.close();
			} else if (sec != secondanswer) {
				PreparedStatement statement = connection
						.prepareStatement("insert into answerremark(check_righ_or_wrong)values(?)");
				String m1 = sec.replaceFirst(sec, "False");
				statement.setString(1, m1);
				int a = statement.executeUpdate();
				System.out.println(a);
				statement.close();
			}
			if (third.equals(thirdanswer)) {
				PreparedStatement statement = connection
						.prepareStatement("insert into answerremark(check_righ_or_wrong)values(?)");
				String m1 = third.replaceFirst(third, "True");
				statement.setString(1, m1);
				int a = statement.executeUpdate();
				System.out.println(a);
				count++;
				statement.close();
			} else if (third != thirdanswer) {
				PreparedStatement statement = connection
						.prepareStatement("insert into answerremark(check_righ_or_wrong)values(?)");
				String m1 = sec.replaceFirst(sec, "False");
				statement.setString(1, m1);
				int a = statement.executeUpdate();
				System.out.println(a);
				statement.close();
			}
			if (four.equals(fourthanswer)) {
				PreparedStatement statement = connection
						.prepareStatement("insert into answerremark(check_righ_or_wrong)values(?)");
				String m1 = four.replaceFirst(four, "True");
				statement.setString(1, m1);
				int a = statement.executeUpdate();
				System.out.println(a);
				count++;
				statement.close();
			} else if (four != fourthanswer) {
				PreparedStatement statement = connection
						.prepareStatement("insert into answerremark(check_righ_or_wrong)values(?)");
				String m1 = four.replaceFirst(four, "False");
				statement.setString(1, m1);
				int a = statement.executeUpdate();
				System.out.println(a);
				statement.close();
			}
			if (fift.equals(fifthanswer)) {
				PreparedStatement statement = connection
						.prepareStatement("insert into answerremark(check_righ_or_wrong)values(?)");
				String m1 = fift.replaceFirst(fift, "True");
				statement.setString(1, m1);
				int a = statement.executeUpdate();
				System.out.println(a);
				count++;
				statement.close();
			} else if (fift != fifthanswer) {
				PreparedStatement statement = connection
						.prepareStatement("insert into answerremark(check_righ_or_wrong)values(?)");
				String m1 = fift.replaceFirst(fift, "False");
				statement.setString(1, m1);
				int a = statement.executeUpdate();
				System.out.println(a);

				statement.close();
			}
			if (sixt.equals(sixthanswer)) {
				PreparedStatement statement = connection
						.prepareStatement("insert into answerremark(check_righ_or_wrong)values(?)");
				String m1 = sixt.replaceFirst(sixt, "True");
				statement.setString(1, m1);
				int a = statement.executeUpdate();
				System.out.println(a);
				count++;
				statement.close();
			} else if (sixt != sixthanswer) {
				PreparedStatement statement = connection
						.prepareStatement("insert into answerremark(check_righ_or_wrong)values(?)");
				String m1 = sixt.replaceFirst(sixt, "False");
				statement.setString(1, m1);
				int a = statement.executeUpdate();
				System.out.println(a);
				statement.close();
			}
			if (seventh.equals(sevenanswer)) {
				PreparedStatement statement = connection
						.prepareStatement("insert into answerremark(check_righ_or_wrong)values(?)");
				String m1 = sixt.replaceFirst(sixt, "True");
				statement.setString(1, m1);
				int a = statement.executeUpdate();
				System.out.println(a);
				count++;
				statement.close();
			} else if (seventh != sevenanswer) {
				PreparedStatement statement = connection
						.prepareStatement("insert into answerremark(check_righ_or_wrong)values(?)");
				String m1 = seventh.replaceFirst(seventh, "False");
				statement.setString(1, m1);
				int a = statement.executeUpdate();
				System.out.println(a);

				statement.close();
			}
			connection.close();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		System.out.println("Sucessfully Done....");
	}

	public void questionAnswer() {
		System.out.println("Enter the first answer");
		Scanner scanner = new Scanner(System.in);
		String firans = scanner.nextLine();
		System.out.println("Enter second answer");
		String secans = scanner.nextLine();
		System.out.println("Enter the third answer");
		String thirdans = scanner.nextLine();
		System.out.println("Enter the fourth answer");
		String fourans = scanner.nextLine();
		System.out.println("Enter the fifth answer");
		String fifthans = scanner.nextLine();
		System.out.println("Enter the sisxth answer");
		String sixthans = scanner.nextLine();
		System.out.println("Enter the seventh answer");
		String seventh = scanner.nextLine();

		try {
			getConnection(firans, secans, thirdans, fourans, fifthans, sixthans, seventh);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		try {
			countAnswer();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	static String grade1;
	static String grade2;
	static String grade3;

	public void countAnswer() throws SQLException {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root",
					"root");
			PreparedStatement statement = connection
					.prepareStatement("insert into displayresult(Student_Name,NumRightQue,Grade)values(?,?,?)");

			String name = SignIn.studentname;
			statement.setString(1, name);
			statement.setInt(2, count);
			if (count >= 1 && count <= 7) {
				String s1 = "A";
				grade1 = s1;
				statement.setString(3, grade1);
			}  if (count >= 1 && count <= 5) {
				String s2 = "B";
				grade2 = s2;
				statement.setString(3, grade2);
			}
			if (count >= 1 && count <= 3) {
				String s3 = "C";
				grade3 = s3;
				statement.setString(3, grade3);
			}

			int a = statement.executeUpdate();
			System.out.println("Operation of mark is done::" + a);
			connection.close();
			statement.close();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		System.out.println("Grade is inserted");
	}

}
