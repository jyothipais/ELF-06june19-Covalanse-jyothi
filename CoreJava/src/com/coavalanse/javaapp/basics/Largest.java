package com.covalense.javaapp.basics;

import java.util.logging.Logger;

public class Largest {
	final static Logger loger = Logger.getLogger("Largest");
	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		if (a > b) {
			loger.info("A is greater than B" + a);
		} else {
			loger.info("B is greater than A" + b);
		}
	}
}
