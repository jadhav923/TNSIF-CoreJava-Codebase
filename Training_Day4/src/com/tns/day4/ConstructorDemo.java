package com.tns.day4;

import java.util.Scanner;

public class ConstructorDemo {
	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		int id;
		String name;
		String city;
		
		System.out.println("Enter Id:");
		id=ip.nextInt();
		
		System.out.println("Enter Name:");
		name=ip.nextLine();
		
		System.out.println("Enter City:");
		city=ip.next();
		
		Customer c=new Customer();
		
		c.setCustomerId(id);
		c.setCustomerName(name);
		c.setCustomerCity(city);
		
		
		
	}

}
