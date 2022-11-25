package com.yash.springboot.Exception;


// Custom Exception
public class BadCredentialException extends RuntimeException {

	public BadCredentialException(String s) {
		super(s);
	}

}
