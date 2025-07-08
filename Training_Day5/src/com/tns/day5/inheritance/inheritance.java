package com.tns.day5.inheritance;
//Parent class,Base class,Super Class

public class inheritance {
	private String name;
	private String AdharNo;
	private String Address;
	private long phone;
	
	public inheritance() {
		System.out.println("Inheritance object is created");
	}

	//para constructor
	public inheritance(String name, String adharNo, String address, long phone) {
		super();
		this.name = name;
		AdharNo = adharNo;
		Address = address;
		this.phone = phone;
	}

	//getter and setter method 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdharNo() {
		return AdharNo;
	}

	public void setAdharNo(String adharNo) {
		AdharNo = adharNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	//tostring
	@Override
	public String toString() {
		return "inheritance [name=" + name + ", AdharNo=" + AdharNo + ", Address=" + Address + ", phone=" + phone + "]";
	}
	
	
}
