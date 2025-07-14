package com.tns.synchronization;

public class DepositLImitException  extends Exception  {
	public DepositLImitException() {
		super("Daily limit of deposit exceed.....");
	}
	public DepositLImitException(String str) {
		super(str);
	}

}
