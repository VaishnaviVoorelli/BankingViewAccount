package com.cg.exceptions;

@SuppressWarnings("serial")

//Creating an exception for Invalid login credentials


public class LoginException extends Exception {
	
	public LoginException() {
		
		super();
	}
	
	public LoginException(String message) {
		
		super(message);
	}

}
