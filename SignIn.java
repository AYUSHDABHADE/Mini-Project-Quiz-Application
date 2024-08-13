package com.java.mini_project;

import java.util.Scanner;


public class SignIn {
	static String studentname;
	  public void  username(String name) {
		   studentname=name;
	  }
	
	public static String name="Ayush Dabhade";
	public void userSignIn() {
		System.out.println("Enter the first name");
		Scanner scanner = new Scanner(System.in);
		String fname = scanner.nextLine();
		System.out.println("Enter the last name");
		String lname = scanner.nextLine();
		System.out.println("Enter the username");
		String username = scanner.nextLine();
		System.out.println("Enter the Password");
		String password = scanner.nextLine();
		System.out.println("Enter the email id");
		String emailid = scanner.nextLine();
		System.out.println("Enter the mobile number");
		String mobilenumber = scanner.nextLine();
		System.out.println("Enter the Student name");
		 String Studentname= scanner.nextLine();
		username(Studentname);
	}
}
