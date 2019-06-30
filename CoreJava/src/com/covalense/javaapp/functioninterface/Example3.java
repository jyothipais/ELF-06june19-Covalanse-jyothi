package com.covalense.javaapp.functioninterface;

import java.util.function.Function;
import java.util.logging.Logger;

public class Example3 {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("Example3");
		Function<Integer, Integer> f = a -> a * a;
		Integer x = f.apply(5);
		loger.info("" + x);
	}

}
