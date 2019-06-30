package com.covalense.javaapp.functioninterface;

import java.util.function.Function;
import java.util.logging.Logger;

public class Example1 {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("Example1");
		Function<Double, Double> f = r -> 3.14 * r * r;
		double x = f.apply(5.2);
		loger.info(" " + x);
	}
}
