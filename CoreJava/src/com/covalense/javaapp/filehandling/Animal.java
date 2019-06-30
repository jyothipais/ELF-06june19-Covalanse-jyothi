package com.covalense.javaapp.filehandling;

import java.util.logging.Logger;

public class Animal {
	private final static Logger loger = Logger.getLogger("Animal");

	void sound() {
		loger.info("sound of Animal");
	}

	void div(int a, int b) {
		int res = a / b;
	}

}
