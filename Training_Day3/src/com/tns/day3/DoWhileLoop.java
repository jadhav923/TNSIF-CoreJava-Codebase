package com.tns.day3;

public class DoWhileLoop {

	public static void main(String[] args) {
		// Execute once even while condition is false 
		int a=1;
		do {
			System.out.println(a);
			a++;
		}while(a<0);
		System.out.println("                       ");
		
		
		// full execution
		int b=1;
		do {
			System.out.println(b);
			b++;
		}while(b<50);
	}

}
