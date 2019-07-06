package com.covalanse.javaapp.exception;

import java.util.logging.Logger;

public class Paytm {
	final static Logger loger = Logger.getLogger("Testaniaml");
	void book() {
		System.out.println("payment for the ticket booking");
		try {

			System.out.println(10 / 0);
		} catch (ArithmeticException a) {
			System.out.println("dont deal with 0");

		}
	}

}
