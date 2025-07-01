package com.tns.day3;

public class Continue_and_Break {

	public static void main(String[] args) {
		
		// Continue 
		for(int k=1; k<15; k++) {
			
			if(k%2!=0) 
				continue;
			System.out.println(k+" is even no ");
		}
		
		// Break 
        for(int k=1; k<15; k++) {
			
			if(k==5) 
				break;
			System.out.println(k);
		}

	}

}
