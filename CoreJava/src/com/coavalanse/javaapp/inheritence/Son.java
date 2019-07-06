package com.covalense.javaapp.inheritence;

import java.util.logging.Logger;

public class Son extends Overiding {
	final Logger loger = Logger.getLogger("Son");

	void bike() {
		loger.info("Modified Bike");
	}

	public static void main(String[] args) {
		Overiding o = new Son();
		o.bike();
	}
}
