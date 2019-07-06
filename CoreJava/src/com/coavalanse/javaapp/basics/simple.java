package com.covalense.javaapp.basics;

import java.util.logging.Logger;

public class simple {
	final static Logger loger = Logger.getLogger("simple");
	public static void main(String[] args) {
		int p=15000;
		int t=2;
		double r=14.92;
		double result=(p*t*r);

		loger.info(""+result);
	}

}
