package com.tns.day4;

public class FirstPackage {
	int varDefalut=10;
	public int varp=20;
	private int varpv=30;
	protected int  varpro=40;
	
	void method1() {
		System.out.println("hello im default");
		System.out.println(varDefalut);
	}
	
	public void method2() {
		System.out.println("hello im public");
		System.out.println(varp);

	}
	
	private void method3() {
		System.out.println("hello im private");
		System.out.println(varpv);

	}
	
	protected void method4() {
		System.out.println("hello im protected");
		System.out.println(varpro);

	}
	

}
