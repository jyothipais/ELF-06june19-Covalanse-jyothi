package com.covalense.javaapp.jodadatetime;

import java.time.LocalDate;
import java.util.logging.Logger;

public class ExampleA {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("ExampleA");
		LocalDate l=LocalDate.now();
		loger.info(""+l.getDayOfMonth());
		loger.info(""+l.getDayOfWeek());
		loger.info(""+l.getDayOfYear());
		loger.info(""+l.getDayOfMonth());
		loger.info(""+l.getMonthValue());
	}

}
