package com.covalense.javaapp.basics;

import java.util.logging.Logger;

public class Method {
	final static Logger loger = Logger.getLogger("Method");
	static int multiplication(int a, int b) {
		int c = a * b;
		return c;

	}

	public static void main(String[] args) {
		int i = multiplication(10, 2);
		loger.info("result is " + i);
	}

}
