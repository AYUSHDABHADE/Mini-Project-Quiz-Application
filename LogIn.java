package com.java.mini_project;

import java.util.Scanner;

import javax.security.auth.login.LoginException;

public class LogIn {
	String username = "ayushdabhade2@gmail.com";
	String password = "ayush@123";

	public void getdataUser(String uname, String upass) throws LoginException {
		if (username.equals(uname) && password.equals(upass)) {
			System.out.println("Log in Sucesfull");
		} else {
			throw new LoginException("invalid user id or password");
		}
	}
          public  void getinput() {
		System.out.println("Enter the user id");
		Scanner scanner = new Scanner(System.in);
		String useid = scanner.next();
		System.out.println("Enter the password");
		String upass = scanner.next();

		try {
			getdataUser(useid, upass);
		} catch (LoginException e) {

			e.printStackTrace();
		}
	}

}
