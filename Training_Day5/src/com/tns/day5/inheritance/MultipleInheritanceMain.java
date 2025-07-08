package com.tns.day5.inheritance;

public class MultipleInheritanceMain {
	public static void main(String[] args) {
		
		MultipleInheritanceExtends2 c = new MultipleInheritanceExtends2();
		c.setArea(234587.678f);
		c.setCapital("Delhi");
		c.setCityName("Pune");
		c.setCountryName("India");
		c.setLanguage("Marathi");
		c.setStateName("Maharashtra");
		
		System.out.println(c);
	}
}		
