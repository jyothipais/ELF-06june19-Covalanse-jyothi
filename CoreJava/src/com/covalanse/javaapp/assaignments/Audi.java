package com.covalanse.javaapp.assaignments;

import java.util.logging.Logger;

public class Audi extends Car1 {
	final Logger loger = Logger.getLogger("Audi  ");

	void driving() {
		loger.info("driving audi car");
	}

}
