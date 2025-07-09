package com.tns.day7.abstraction;

public class Square extends Shape {
	float side;
	
	 public Square(){
		side=20f;
	}
	
	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	public void calArea() {
		this.area=side*side;   ///this area from parent

}
}
