package com.covalense.javaapp.filehandling;

import java.util.logging.Logger;

public class Cow extends Animal {
	private final static Logger loger = Logger.getLogger("Cow");

	void sound() {
		loger.info("ambaaa");
	}

	void div(int a, int b) {
		int res = a / b;
	}
}
