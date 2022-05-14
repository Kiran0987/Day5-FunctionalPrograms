package com.bridgelab;

public class Distance {
	public static void main(String[] args) {

		int x = 2;
		int y = 3;

		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		System.out.println("Distance from (0, 0) (x,y) is " + distance);
	}
}
