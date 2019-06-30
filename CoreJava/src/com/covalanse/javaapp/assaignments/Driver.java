package com.covalanse.javaapp.assaignments;

import java.util.logging.Logger;

public class Driver {
	final Logger loger = Logger.getLogger("Driver  ");
	void receive(Car1 c) {
		if (c instanceof Audi) {
		loger.info("drive audi");
		} else if (c instanceof Benz) {
		loger.info("drive benz");
		}

	}

}
