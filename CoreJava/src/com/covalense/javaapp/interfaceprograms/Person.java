package com.covalense.javaapp.interfaceprograms;

import java.util.logging.Logger;

public class Person implements Animal, Human {
	final Logger loger = Logger.getLogger("Person");

	public void eat() {
		loger.info("eating");
	}

	public void walk() {
		loger.info("walking");
	}
}
