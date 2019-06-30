package com.covalense.javaapp.jodadatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.logging.Logger;

public class ExampleD {
	public static void main(String[] args) {
		final  Logger loger = Logger.getLogger("EmployeD");
		ZoneId z=ZoneId.systemDefault();
		loger.info(""+z);
		
		ZoneId z1=ZoneId.of("Austraia/sydney");
		ZonedDateTime z2=ZonedDateTime.now(z1);
		loger.info(""+z2.toLocalDateTime());
		
	}

}
