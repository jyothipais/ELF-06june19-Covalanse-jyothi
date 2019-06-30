package com.covalense.javaapp.inheritence;

import java.util.logging.Logger;

public class Cow extends Lion {
	final Logger loger = Logger.getLogger("Cow");

	void eatt() {
		loger.info("Cow is eating grass");
	}

	public static void main(String[] args) {
		Cow c = new Cow();
		c.eatt();
		c.eat();
		c.eating();
	}
}
