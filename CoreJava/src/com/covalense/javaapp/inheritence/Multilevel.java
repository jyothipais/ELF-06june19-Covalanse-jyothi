package com.covalense.javaapp.inheritence;

import java.util.logging.Logger;

public class Multilevel {
	final Logger loger = Logger.getLogger("Multilevel");

	void level0() {
		loger.info("im a parent class content");
	}

}
