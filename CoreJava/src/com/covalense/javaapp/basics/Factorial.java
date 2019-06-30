package com.covalense.javaapp.basics;

import java.util.logging.Logger;

public class Factorial {
	final static Logger loger = Logger.getLogger("Factorial");
	public static void main(String[] args) {
		int result = factorial(5);
		loger.info(""+result);
	}

	static int factorial(int a) {
		if (a == 0) {
			return 1;
		}
		return a * factorial(a - 1);
	}
}
