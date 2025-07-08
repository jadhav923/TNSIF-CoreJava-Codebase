package com.tns.day5.inheritance;

public class hierarchicalmain {
	public static void main(String[] args) {
		Hiearachical person =new Hiearachical();
		System.out.println("---------Person Details--------------");
		System.out.println(person);
		
		Hiearachical Person1;
		Person1 = new Hiearachical("Sneha", "Pakistan");
		System.out.println(Person1);
		
		Person1 =new hierarchicalInheritance("Priyanka","Afghanistan","SYBE",56478);
		System.out.println(Person1);
		
		Person1 =new hierarchicalinheritancedemo("Pratiksha","Nagar",502, 60000, "HR");
		System.out.println(Person1);
	}
}
