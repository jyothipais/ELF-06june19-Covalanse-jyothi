package com.covalanse.javaapp.exception;

public class Paytm {
	void book() {
		System.out.println("payment for the ticket booking");
		try {

			System.out.println(10 / 0);
		} catch (ArithmeticException a) {
			System.out.println("dont deal with 0");

		}
	}

}
