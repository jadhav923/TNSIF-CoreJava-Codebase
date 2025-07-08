package com.tns.day5.inheritance;

public class Address {
	
	private String street;
	private String City;
	private String State;
	private int postalCode;
	
	//Default Constructor
	public Address() {
		super();
	}

	//Parameterized Constructor
	public Address(String street, String city, String state, int postalCode) {
		super();
		this.street = street;
		City = city;
		State = state;
		this.postalCode = postalCode;
	}

	
	//Getter and setter
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

}
