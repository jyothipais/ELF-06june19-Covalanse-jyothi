package com.covalanse.javaapp.framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.logging.Logger;

public class GenericStringTypeArrayListUsingIterator1 {

	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("GenericStringTypeArrayListUsingIterator1");
		ArrayList<String> a = new ArrayList<String>();
		a.add("eyekiller");
		a.add("sara");
		a.add("minikutty");

		for (String d : a) {
			loger.info("" + d);
		}
		loger.info("*************ITERATOR**********");

		Iterator<String> it = a.iterator();
		while (it.hasNext()) {
			String r = it.next();
			loger.info("" + r);
		}

		loger.info("************LISTITERATOR***************");
		ListIterator<String> lst = a.listIterator(a.size());
		while (lst.hasNext()) {
			String r = lst.next();
			loger.info("" + r);
		}
		loger.info("**************backward**************");

		while (lst.hasPrevious()) {
			String r = lst.previous();
			loger.info("" + r);
		}
	}
}
