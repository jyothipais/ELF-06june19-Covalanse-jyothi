package com.covalanse.javaapp.assaignments;

import java.util.logging.Logger;

public class Gun {
	final Logger loger = Logger.getLogger("Gun  ");
	int b;

	Gun(int b) {
		this.b = b;

		loger.info(""+b);

	}
}
