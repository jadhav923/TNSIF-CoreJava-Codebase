package com.tns.Exception;

public class greaterValueException  extends Exception{
	public greaterValueException(String str) {
		super(str);
	}
	public greaterValueException() {
		super("percentage should not be greater than 100");
	}

}
