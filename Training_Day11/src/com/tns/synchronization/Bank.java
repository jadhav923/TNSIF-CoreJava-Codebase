package com.tns.synchronization;

public class Bank {
	
	static final int MINBAL=5000;
	static final int DAILY_LIMIT=25000;
	void deposit(int amt)throws DepositLImitException ;
	void withdraw(int amt)throws InsufficientBAlanceException;

}
