package com.covalense.javaapp.inheritence;

import java.util.logging.Logger;

public class Animal {
	final Logger loger = Logger.getLogger("Animal");

	void eating() {
		loger.info("ANIMAL is eating food");
	}
}
