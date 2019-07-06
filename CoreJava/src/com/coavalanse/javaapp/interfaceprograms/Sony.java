package com.covalense.javaapp.interfaceprograms;

import java.util.logging.Logger;

public class Sony implements Printer {
	final Logger loger = Logger.getLogger("Sony");

	public void print() {
		loger.info("printing");
	}

}
