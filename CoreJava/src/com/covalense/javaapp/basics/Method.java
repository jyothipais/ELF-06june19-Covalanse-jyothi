package com.covalense.javaapp.basics;

public class Method {
	static int multiplication(int a, int b) {
		int c = a * b;
		return c;

	}

	public static void main(String[] args) {
		int i = multiplication(10, 2);
		System.out.println("result is " + i);
	}

}
