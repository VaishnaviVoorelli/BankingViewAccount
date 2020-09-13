package com.cg.exceptions;

@SuppressWarnings("serial")

//Creating an exception for Invalid customer credentials


public class CustomerException extends Exception {

	public CustomerException() {
		super();
	}

	public CustomerException(String message) {
		super(message);
	}

	
}
