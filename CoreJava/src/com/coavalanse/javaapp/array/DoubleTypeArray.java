package com.covalance.javaapp.array;

import java.util.logging.Logger;

public class DoubleTypeArray {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("DoubleTypeArray ");
		double[] a = { 6.2, 9.8, 4.6, 9.1, 0.7, 5.3 };

		for (double r : a) {
			loger.info("" + r);
		}
	}
}
