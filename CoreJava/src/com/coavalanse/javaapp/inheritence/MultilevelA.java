package com.covalense.javaapp.inheritence;

import java.util.logging.Logger;

public class MultilevelA extends Multilevel {
	final Logger loger = Logger.getLogger("MultilevelA");

	void level1() {
		loger.info("im a child class content of  Multilevel and parent class content of a Multilevel2");
	}

}
