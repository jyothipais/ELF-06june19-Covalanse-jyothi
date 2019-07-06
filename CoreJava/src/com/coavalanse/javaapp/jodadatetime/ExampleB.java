package com.covalense.javaapp.jodadatetime;

import java.time.LocalTime;
import java.util.logging.Logger;

public class ExampleB {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("ExampleB");
		LocalTime l = LocalTime.now();
		loger.info("" + l.getHour());
		loger.info("" + l.getNano());
	}

}
