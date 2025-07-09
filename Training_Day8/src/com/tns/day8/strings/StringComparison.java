package com.tns.day8.strings;

public class StringComparison {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating string----pool memory
		
		String s1="TNSIF";
		String s2="TNSIF";
		
		//creating new String-----heap memory
		
		String s3=new String("TNSIF");  //here always new memory is created
		
		//s3 and s4 have different memory
		
		String s4=new String("TNSIF");//new memory  created because new is there
		
		
		//== checks memory   equals will check only data
		System.out.println("case 1:"+(s1==s2)); //true
		System.out.println("case 2:"+(s1==s3)); //false
		System.out.println("case 1:"+(s2.equals(s1))); //true
		System.out.println("case 1:"+(s2.equals(s4))); //true
		System.out.println("case 1:"+(s3==s4)); //false
		System.out.println("case 1:"+(s3.equals(s4))); //true
		
		
		//use of hashcode
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		//compare by using compareto
		
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareToIgnoreCase(s4));
		
		// String Operations
		

		String ss1=new String(" Indian ");
		System.out.println(ss1);
		
		String ss2=s1.toUpperCase();
		System.out.println(ss2);
		
		System.out.println(s1.length());
		
		String ss3=s1.substring(2);
		System.out.println(ss3);
		
		String ss4=s1.substring(1, 3);
		System.out.println(ss4);
		
		System.out.println(ss1.trim());  //used to remove spaces
		System.out.println(ss1.stripTrailing());
		
		//string comparison
		ss2=new String(ss1);  //new instance is created for s2(new memory created for s2)
		
		//==  -->object reference (check whether memory is same or not)
		
		//equals -->check data
		
		System.out.println("case 1:"+ss1.equals(ss2));
		
		System.out.println("case 2:"+ss1==ss2);
		
		
		

	}

}
