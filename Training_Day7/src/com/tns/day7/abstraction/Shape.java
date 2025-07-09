package com.tns.day7.abstraction;

public abstract class Shape {
protected float area;
	
	//abstract method
	public abstract void calArea();
	
	//solid method
	public void show() {
		System.out.println("Area of shape is: "+area);

}
}
