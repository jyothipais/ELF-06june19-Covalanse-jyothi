package com.covalense.javaapp.functioninterface;

import java.util.function.Function;
import java.util.logging.Logger;

public class Example2 {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("Example2");
		Function<String, Integer> f = a -> a.length();
		Integer x = f.apply("hiiii");
		loger.info("" + x);
	}

}
