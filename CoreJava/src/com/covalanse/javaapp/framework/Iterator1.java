
package com.covalanse.javaapp.framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

public class Iterator1 {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("Iterator1");
		ArrayList a = new ArrayList();

		a.add(12);
		a.add("eyekiller");
		a.add(22.5);
		a.add('B');

		Iterator it = a.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			loger.info("" + r);
		}

	}

}
