package com.covalanse.javaapp.casting;

import java.util.logging.Logger;

public class Cow extends Animal {
	final Logger loger = Logger.getLogger("Cow");
	int i;

	void run() {
		loger.info("running");
	}

}
