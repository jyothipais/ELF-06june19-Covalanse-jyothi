package com.covalense.javaapp.basics;

import java.util.logging.Logger;

public class avg {
	final static Logger loger = Logger.getLogger("avg");
	public static void main(String[] args) {
		double a = 20, b = 22, c = 24;
		loger.info(""+(a + b + c) / 3.0);

	}

}
