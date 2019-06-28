package com.covalense.javaapp.asessment;

import java.util.logging.Logger;

public class Dog extends Animal {
	final Logger loger = Logger.getLogger("Dog");

	void sound() {
		loger.info("bow bow");
	}

}
