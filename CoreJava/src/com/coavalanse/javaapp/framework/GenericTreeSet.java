package com.covalanse.javaapp.framework;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.logging.Logger;

public class GenericTreeSet {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("GenericTreeSet");
		TreeSet<Integer> hs = new TreeSet<Integer>();
		hs.add(29);
		hs.add(44);
		hs.add(89);

		for (Integer r : hs) {
			loger.info("" + r);
		}

		loger.info("********** ITERATOR**********");

		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			Integer r = it.next();
			loger.info("" + r);
		}
	}

}
