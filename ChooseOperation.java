package com.java.mini_project;

import java.sql.SQLException;
import java.util.Scanner;

//import DummmProject.DatabaseCoonection;

public class ChooseOperation {

	public void seletoperation() {
		System.out.println("Enter the switch cases");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		switch (num) {
		case 1:
			SignIn signin = new SignIn();
			signin.userSignIn();
			break;
		case 2:
			LogIn login = new LogIn();
			login.getinput();
			break;
		
		case 3:
			 DatabaseConnectivity connectivity = new DatabaseConnectivity();
			
			 try {
				connectivity.getConnectivity();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			 break;
		case 4:
			AnswerPerson answerPerson = new AnswerPerson();
		answerPerson.questionAnswer();
			break;
		case 5:
			LogIn login2 = new LogIn();
			 login2.getinput();
			DisplayResult displayResult= new DisplayResult();
			
			try {
				displayResult.getresult();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			break;
		case 6:
			StudentgetResult StudentgetResult1 = new StudentgetResult();
			try {
				StudentgetResult1.studentfirstResultGet();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			break;
		case 7:
			StudentgetResult StudentgetResult2 = new StudentgetResult();
			try {
				StudentgetResult2 .studentsecondResultGet();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			break;
		case 8:
			StudentgetResult StudentgetResult3 = new StudentgetResult();
			try {
				StudentgetResult3.studentThirdResultGet();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
