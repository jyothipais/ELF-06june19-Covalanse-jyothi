package com.covalanse.javaapp.framework;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.logging.Logger;

public class GenericLinkedHashSet {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("GenericLinkedHashSet");
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		hs.add(29);
		hs.add(48);
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
