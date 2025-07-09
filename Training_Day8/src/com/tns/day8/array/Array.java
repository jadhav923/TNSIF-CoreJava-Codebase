package com.tns.day8.array;

import java.util.Arrays;

import javax.print.attribute.IntegerSyntax;

public class Array {

	public static void main (String[] args) {
		int arr[]= {8,66,33,1,2,44,5,69,77};
		// toString
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println("\n");
		// sort 
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//binary
		System.out.println(Arrays.binarySearch(arr, 4));
		
		// new array
		int arr2[]= {8,66,33,1,2,44,5,69,77};
		System.out.println(Arrays.toString(arr2));
		
		//array compare
		if(arr==arr2) {
			System.out.println("arrays are same");
			
		}else {
			System.out.println("arr2 is not sorted due to its not same even the data is same ");
		}
		
		//copy of
		int arr3[]= Arrays.copyOf(arr2, 2);
		System.out.println(Arrays.toString(arr3));
		
		//array of range
		int arr4[]= Arrays.copyOfRange(arr2,0,9);
		System.out.println(Arrays.toString(arr4));
		
		//variable argument function 
		
	
		
		
		

	}

}
