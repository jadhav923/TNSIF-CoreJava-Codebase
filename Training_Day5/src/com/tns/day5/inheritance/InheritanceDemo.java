package com.tns.day5.inheritance;
//Child class,Derived class,Sub Class
public class InheritanceDemo extends inheritance{
	
//	private String stuentname;
//  private String AdharNumber;
//	private String address;
//	private long phoneno;
	private int RollNo;
	private String collegeName;
	
	//Non Parameterized Constructor
	public InheritanceDemo() {
		super();
	}

	//Parameterized Constructor
	public InheritanceDemo(String name, String adharNo, String address, long phone,int rollNo, String collegeName) {
		super(name, adharNo, address, phone);
		this.RollNo = rollNo;
		this.collegeName = collegeName;
		
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "InheritanceDemo [RollNo=" + RollNo + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAdharNo()=" + getAdharNo() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ "]";
	}

	
	
	
	
}
