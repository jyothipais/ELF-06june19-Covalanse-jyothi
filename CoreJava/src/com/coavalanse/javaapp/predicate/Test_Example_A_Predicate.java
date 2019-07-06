//String length is more than 5 print true else false
package com.covalense.javaapp.predicate;

import java.util.function.Predicate;
import java.util.logging.Logger;

public class Test_Example_A_Predicate {
	final Logger loger = Logger.getLogger("Test_Example_A_Predicate");

	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("LamdaSquare");
		Predicate<String> s = a -> a.length() >= 5;
		boolean x = s.test("hiiiii");
		loger.info("" + x);

	}

}
