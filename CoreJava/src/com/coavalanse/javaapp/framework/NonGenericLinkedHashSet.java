package com.covalanse.javaapp.framework;

import java.util.Iterator;

import java.util.LinkedHashSet;
import java.util.logging.Logger;

public class NonGenericLinkedHashSet {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("NonGenericLinkedHashSet");
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(29);
		hs.add("Eye Killer");
		hs.add(55.7);

		for (Object r : hs) {
			loger.info("" + r);
		}

		loger.info("********** ITERATOR**********");

		@SuppressWarnings("rawtypes")
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			loger.info("" + r);
		}
	}
}
