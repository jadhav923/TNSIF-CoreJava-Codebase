package com.tns.day4;

public class Customer {
	private String customerName;
	private int customerId;
	private String customerCity;

//default constructor 
	public Customer() {
		System.out.println("hello this is default comstuctor");
		
	}
//para constructor 
	public Customer(String customerName, int customerId, String customerCity) {
		// this (); //calling default constructor 
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	
	

}
