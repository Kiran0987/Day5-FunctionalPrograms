package com.bridgelab;

public class WindChill {
	public static void main(String[] args) {
		
		double t = 56;
		double v = 121;
		if (t > 50 && v > 120 || v < 3) {
			double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
			System.out.println("The effective temperature (the wind chill) to be: " + w);
		}
		else {
			System.out.println(" values is Invalid Range");
		}
	}
}

