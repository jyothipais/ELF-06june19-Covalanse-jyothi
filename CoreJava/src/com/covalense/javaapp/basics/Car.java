package com.covalense.javaapp.basics;

import java.util.logging.Logger;
public class Car {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("Car");
		double car = 570000, rto = (14.26 * car) / 100, ins = (9.6 * car) / 100, total = car + rto + ins;
		loger.info("car price is " + car);
	loger.info("RTO charge is" + rto);
	loger.info("your insurence charge is" + ins);

	}

}
