package com.tns.synchronization;

public class InsufficientBAlanceException extends Exception  {
	public  InsufficientBAlanceException() {
		super("insufficient balance...");
	}
	public  InsufficientBAlanceException(String msg) {
		super(msg);
	}


}
