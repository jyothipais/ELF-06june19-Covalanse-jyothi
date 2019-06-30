package com.covalanse.javaapp.objectoriented;

import java.util.logging.Logger;

public class Person {
	final Logger loger = Logger.getLogger("Person ");
	Mobile m = new Mobile();

	void speak() {
		loger.info("speaking");
	}

}
