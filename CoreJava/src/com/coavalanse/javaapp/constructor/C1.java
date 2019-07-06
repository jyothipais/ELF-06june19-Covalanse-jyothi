package com.covalense.javaapp.constructor;

import java.util.logging.Logger;

public class C1 {
	final static Logger loger = Logger.getLogger("C1");

	C1(int x) {
		loger.info("integer");
	}

	C1(double y) {
		loger.info("double");
	}

	public static void main(String[] args) {
		new C1(14.5);
	}
}
