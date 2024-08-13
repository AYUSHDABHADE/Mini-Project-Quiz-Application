package com.java.mini_project;

public class MainMethod {
public static void main(String[] args) {
	ChooseOperation chooseOperation = new ChooseOperation();
	DashBord dashbord= new DashBord();
	dashbord.getDashBord();
	for(int i=1;i<=8;i++) {
		chooseOperation.seletoperation();
	}

}
}
