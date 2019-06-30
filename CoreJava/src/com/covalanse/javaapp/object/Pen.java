package com.covalanse.javaapp.object;

import java.util.logging.Logger;

public class Pen {
	final  Logger loger = Logger.getLogger("Pen");
	void open() {
		loger.info("Open the pen ");
	}

	void write() {
		loger.info("write by using pen");
	}
}
