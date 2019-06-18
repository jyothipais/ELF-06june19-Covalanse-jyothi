package com.covalense.javaapp.basics;

public class Factorial {
	public static void main(String[] args) {
		int result = factorial(5);
		System.out.println(result);
	}

	static int factorial(int a) {
		if (a == 0) {
			return 1;
		}
		return a * factorial(a - 1);
	}
}
