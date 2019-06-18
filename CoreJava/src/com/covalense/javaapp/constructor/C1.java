package com.covalense.javaapp.constructor;

public class C1 {
	C1(int x) {
		System.out.println("integer");
	}

	C1(double y) {
		System.out.println("double");
	}

	public static void main(String[] args) {
		// new C1(5);
		new C1(14.5);
	}
}
