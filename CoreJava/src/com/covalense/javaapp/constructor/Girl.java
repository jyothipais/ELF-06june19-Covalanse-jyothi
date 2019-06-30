package com.covalense.javaapp.constructor;

import java.util.logging.Logger;

public class Girl {
	final static Logger loger = Logger.getLogger("Girl");

	void receive(Phone p) {
		if (p instanceof Iphone) {
			loger.info("I LOVE U");
		} else if (p instanceof Mi) {
			loger.info("THANK U BROTHER");
		}

	}
}
