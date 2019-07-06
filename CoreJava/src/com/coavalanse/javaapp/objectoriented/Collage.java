package com.covalanse.javaapp.objectoriented;

import java.util.logging.Logger;

public class Collage {
	final  Logger loger = Logger.getLogger("Collage");
	final static Student s = new Student();

	void teach() {
	loger.info("teaching inside the collage");
	}
}
