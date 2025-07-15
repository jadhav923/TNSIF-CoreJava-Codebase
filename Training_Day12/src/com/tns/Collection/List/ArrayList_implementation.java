package com.tns.Collection.List;
import java.util.*;

public class ArrayList_implementation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list=new ArrayList();
		
		System.out.println(list.isEmpty());
		
		list.add(10);
		list.add(20);
		list.add(10);
		list.add("Vriti");
		list.add(false);
		
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		System.out.println(list.size());
		
		list.remove(2);
		System.out.println(list);
		
		list.remove(false);
		System.out.println(list);
		
		
		list.clear();
		System.out.println(list);
		
		
		
		
		//Generics
		List<String>lis=new ArrayList<String>();
		lis.add("Shrey");
		lis.add("Sohan");
		lis.add("Gauri");
		lis.add("Onkar");
		System.out.println(lis);
		
		Collections.reverse(lis);
		System.out.println(lis);
		
		Collections.sort(lis);
		System.out.println(lis);
		
		//Traversing in list
		
		Iterator<String>i=lis.iterator();
		while(i.hasNext())
		{
			String nm=i.next();
			System.out.println(nm+" ");
		}
		System.out.println();
		System.out.println(lis);
		
		
		
		ListIterator<String>li=lis.listIterator(lis.size());
		while(li.hasPrevious()) {
			String n=li.previous()	;
			System.out.println(n+" ");
		}
	
		
	}

}
