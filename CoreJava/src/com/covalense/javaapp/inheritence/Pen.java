package com.covalense.javaapp.inheritence;

import java.util.logging.Logger;

public class Pen {
	final Logger loger = Logger.getLogger("Pen");
	int cost;

	void write() {
		loger.info("Im using pen to write on the paper");
	}

}
