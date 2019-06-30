package com.covalense.javaapp.stream;

import java.util.logging.Logger;

public class Example_C {
	public static void main(String[] args) {
		final  Logger loger = Logger.getLogger("Testaniaml");
		try {
			loger.info(""+10 / 0);
		} catch (ArithmeticException | NullPointerException e) {
			loger.info("Exception"+e.getMessage());
		} catch (Exception e) {
			loger.info("Last catch block");
		}

	}
}
