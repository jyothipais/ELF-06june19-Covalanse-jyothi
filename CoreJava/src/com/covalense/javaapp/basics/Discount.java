package com.covalense.javaapp.basics;

public class Discount {
	public static void main(String[] args) {
		double p = 500, d = 10;
		int count = 1;
		if (count == 1) {
			p = p - (p * d) / 100;
			System.out.println("you have to pay" + p);
		}

	}

}
