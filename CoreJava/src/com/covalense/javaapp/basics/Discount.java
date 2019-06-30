package com.covalense.javaapp.basics;

import java.util.logging.Logger;

public class Discount {
	final static Logger loger = Logger.getLogger("Discount");
	public static void main(String[] args) {
		double p = 500, d = 10;
		int count = 1;
		if (count == 1) {
			p = p - (p * d) / 100;
		loger.info("you have to pay" + p);
		}

	}

}
