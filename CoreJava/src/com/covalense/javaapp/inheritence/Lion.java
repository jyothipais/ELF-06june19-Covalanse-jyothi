package com.covalense.javaapp.inheritence;

import java.util.logging.Logger;

public class Lion extends Animal {
	final Logger loger = Logger.getLogger("Lion");

	void eat() {
		loger.info("LION is eating meat");
	}
}
