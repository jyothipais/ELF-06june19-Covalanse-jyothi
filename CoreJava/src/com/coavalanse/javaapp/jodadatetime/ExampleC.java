package com.covalense.javaapp.jodadatetime;

import java.time.LocalDate;
import java.time.Period;
import java.util.logging.Logger;

public class ExampleC {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("ExampleC");
		LocalDate l = LocalDate.now();
		loger.info("" + l);

		LocalDate d = LocalDate.of(1998, 01, 14);
		loger.info("I b0Rn 0n :" + d);

		Period p = Period.between(d, l);
		loger.info("*****" + p);
		
		
		loger.info("Year :" + p.getYears());
		loger.info("Months :" + p.getMonths());
		loger.info("Days :" + p.getDays());
		
		int t=p.getYears()*365+p.getMonths()*30+p.getDays();
		
		loger.info(t+"Total days Left");

	}

}
