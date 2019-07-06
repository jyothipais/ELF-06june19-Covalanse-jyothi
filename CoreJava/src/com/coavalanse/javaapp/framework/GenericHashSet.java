package com.covalanse.javaapp.framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.logging.Logger;

public class GenericHashSet {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger(" GenericHashSet");
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(27);
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
