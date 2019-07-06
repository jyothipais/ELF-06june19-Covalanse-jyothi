package com.covalense.javaapp.lamdaassaignments;

import java.util.logging.Logger;

public class PrintNumbers {
	final Logger loger = Logger.getLogger("PrintNumbers ");

	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("Print numbers");
		Range r = a -> {
			loger.info("numbers are :");
			for (int i = 0; i <= a; i++) {
				loger.info("" + i);

			}
			return a;

		};
		int res = r.range(9);
	}
}
