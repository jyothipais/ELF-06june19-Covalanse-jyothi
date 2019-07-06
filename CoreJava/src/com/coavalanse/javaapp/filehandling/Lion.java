package com.covalense.javaapp.filehandling;

import java.util.logging.Logger;

public class Lion extends Animal {
	private final static Logger loger = Logger.getLogger("Lion");

	void sound() {
		loger.info("roaring");
	}

	void div(int a, int b) {
		int res = a / b;
	}
}
