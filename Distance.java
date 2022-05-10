package com.bridgelab;

import java.util.Scanner;

public class Distance {
	//public static void main(String[] args) {

		//int x = 2;
		//int y = 3;

		//double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		//System.out.println("Distance from (0, 0) (x,y) is " + distance);

	
public static void main(String[] args) {
	System.out.println("Welcome to Euclidean Distance Program");
	Scanner scanner= new Scanner(System.in);
    System.out.println("Enter the x value in int");
	int x = scanner.nextInt();
	System.out.println("Enter the y value in int");
	int y = scanner.nextInt();
	double distance = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	//pow(a,b)a=base b=exponent
	System.out.println("the Euclidean distance is:" +distance);
}
}
