package com.bridgelab;

public class Integer_Adds {
	public static void main(String[] args) {  
		int [] arr = new int [] {2,3,-5};  
		int sum = 0;  
		for (int i = 0; i < arr.length; i++) {  
			sum = sum + arr[i];  
		}  
		System.out.println("Sum of all the elements of an array is : " + sum);  
	}  
}  

