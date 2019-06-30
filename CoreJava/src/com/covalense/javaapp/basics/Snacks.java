package com.covalense.javaapp.basics;

import java.util.logging.Logger;

public class Snacks {
	final static Logger loger = Logger.getLogger("Snacks");

	public static void main(String[] args) {
		int price = 50;
		switch (price) {
		case 10:
			loger.info("lays");
			break;
		case 20:
			loger.info("KueKure");
			break;
		case 50:
			loger.info("Dairy Milk");
			break;
		default:
			loger.info("INVALID OPTION!!!!!!!!!!");
		}
	}

}
