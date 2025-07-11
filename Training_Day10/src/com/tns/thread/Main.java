package com.tns.thread;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread c=new ChildThread(11," Onkar923");
		ChildThread c1=new ChildThread(16," Shreya923");
		c.start();
		c1.start();
		System.out.println("end of the program");
	}

}
