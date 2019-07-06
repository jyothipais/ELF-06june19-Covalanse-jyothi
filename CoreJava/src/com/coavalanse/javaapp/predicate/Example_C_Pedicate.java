//number greater than 4
package com.covalense.javaapp.predicate;

import java.util.function.Predicate;
import java.util.logging.Logger;

public class Example_C_Pedicate {
	final static Logger loger = Logger.getLogger("Example_C_Predicate");

	public static void main(String[] args) {
		int[] b = { 2, 5, 9, 6, 4, 3 };

		Predicate<Integer> p = a -> a > 4;
		for (int i = 0; i <= b.length; i++) {
			if (p.test(b[i])) {
				loger.info("" + b[i]);
			}
		}

	};
}
