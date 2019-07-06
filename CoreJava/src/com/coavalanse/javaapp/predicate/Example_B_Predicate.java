//print only odd numbers from array 
package com.covalense.javaapp.predicate;

import java.util.function.Predicate;
import java.util.logging.Logger;

public class Example_B_Predicate {
	final static Logger loger = Logger.getLogger("Example_B_Predicate");

	public static void main(String[] args) {
		int[] b = { 2, 5, 9, 6, 4, 3 };

		Predicate<Integer> p = a -> a % 2 != 0;
		for (int i = 0; i <= b.length; i++) {
			if (p.test(b[i])) {
				loger.info("" + b[i]);
			}
		}

	};
}
