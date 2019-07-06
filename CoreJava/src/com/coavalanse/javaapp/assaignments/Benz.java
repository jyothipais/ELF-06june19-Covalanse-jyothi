package com.covalanse.javaapp.assaignments;

import java.util.logging.Logger;

public class Benz extends Car1 {
	final Logger loger = Logger.getLogger("Benz ");

	void driving() {
		loger.info("driving benz car");
	}

}
