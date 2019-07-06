package com.covalanse.javaapp.framework;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.logging.Logger;

public class NonGenericTreeset {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("NonGenericTreeset");
		TreeSet<Integer> hs = new TreeSet<Integer>();
		hs.add(29);
		hs.add(77);
		hs.add(99);

		for (Object r : hs) {
			loger.info("" + r);
		}

		loger.info("********** ITERATOR**********");

		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			loger.info("" + r);
		}
	}

}
