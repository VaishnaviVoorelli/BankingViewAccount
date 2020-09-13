package com.cg.exceptions;

@SuppressWarnings("serial")

//Creating an exception for Invalid account credentials


public class AccountException extends Exception{

	public AccountException() {
		super();
	}

	public AccountException(String message) {
		super(message);
	}
	

}
