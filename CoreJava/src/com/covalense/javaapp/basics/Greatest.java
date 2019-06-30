package com.covalense.javaapp.basics;

import java.util.logging.Logger;

public class Greatest {
	final static Logger loger = Logger.getLogger("Greatest");
	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		if (a > b) {
			loger.info("A is greatest" + a);
		} else {
			loger.info("B is greatest" + b);
		}

	}
}