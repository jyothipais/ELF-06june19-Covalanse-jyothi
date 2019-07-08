package com.covalense.javaapp.assessmentprogram;

import java.util.logging.Logger;

public class Dog implements Animal {
	final Logger loger = Logger.getLogger("Dog");

	@Override
	public void sound() {
		loger.info("Bow bow");
	}

}
