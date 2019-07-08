package com.covalense.javaapp.assessmentprogram;

import java.util.logging.Logger;

public class Cat implements Animal {
	final Logger loger = Logger.getLogger("Animal");

	@Override
	public void sound() {
		loger.info("mow mow");
	}

}
