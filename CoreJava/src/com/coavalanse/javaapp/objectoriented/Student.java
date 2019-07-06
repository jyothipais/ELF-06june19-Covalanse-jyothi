package com.covalanse.javaapp.objectoriented;

import java.util.logging.Logger;

public class Student {
	final Logger loger = Logger.getLogger("Student ");
	String name;

	void play() {
		loger.info("students are playong inside the class");
	}

}
