package com.java.mini_project;

public class LogInException extends RuntimeException{
String message;
LogInException(String mess){
	super(mess);
}
}
