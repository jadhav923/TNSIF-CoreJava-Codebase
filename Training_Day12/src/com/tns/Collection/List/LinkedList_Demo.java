package com.tns.Collection.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>li=new LinkedList<Integer>();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		System.out.println(li);
		
		li.addFirst(25);
		System.out.println(li);
		
		li.add(2,24);
		System.out.println(li);
		
		li.addLast(50);
		System.out.println(li);
		
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		System.out.println(li);
		li.removeFirst();
		System.out.println(li);
		
		li.removeLast();
		System.out.println(li);
		
		ListIterator<Integer>l1=li.listIterator();
		while(l1.hasNext()) {
			System.out.println(l1.next());
		}
		System.out.println();
		
		l1=li.listIterator(li.size());
		while(l1.hasPrevious()) {
			int n=l1.previous();
			System.out.println(n);
		}
		
	
	}

}
