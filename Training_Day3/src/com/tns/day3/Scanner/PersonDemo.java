package com.tns.day3.Scanner;

import java.util.Scanner;

public class PersonDemo {
	public static void main(String[] args) {
		
		Scanner ob=new Scanner (System.in);
		
		String name;
		System.out.println("Enter person Name:");
		name = ob.next();
		System.out.println("Enter person Age:");
		int age= ob.nextInt();
		System.out.println("Enter person Gender:");
		String gender = ob.next();
		System.out.println("Enter person Mobile No:");
		long mobile_no = ob.nextLong();
		System.out.println("Enter person Income:");
		int income = ob.nextInt();
		
		Person person=new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		person.setMobile_no(mobile_no);
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getGender());
		System.out.println(person.getIncome());
		System.out.println(person.getMobile_no());
		
		TaxCalculation call = new TaxCalculation();
		call.calculateTax(person); 
		System.out.println("Calculated Tax: " + person.getTax()); 

		
		
		
	}

}
