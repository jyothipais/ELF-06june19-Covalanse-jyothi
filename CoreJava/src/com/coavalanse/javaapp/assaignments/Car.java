package com.covalanse.javaapp.assaignments;

import java.util.logging.Logger;

public class Car {
	final Logger loger = Logger.getLogger("Car ");
	int initial;

	Car(int initial) {
		this.initial = initial;
		loger.info(" initial fuel is" + initial);
	}

}
