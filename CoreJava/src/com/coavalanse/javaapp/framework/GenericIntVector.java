package com.covalanse.javaapp.framework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
import java.util.logging.Logger;

public class GenericIntVector {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("GenericIntVector");
		Vector<Integer> a = new Vector<Integer>();
		a.add(20);
		a.add(27);
		a.add(5);

		for (Integer d : a) {
			loger.info("" + d);
		}

		loger.info("*************ITERATOR**********");

		Iterator<Integer> it = a.iterator();
		while (it.hasNext()) {
			Integer r = it.next();
			loger.info("" + r);
		}

		loger.info("************LISTITERATOR***************");

		ListIterator<Integer> lst = a.listIterator();
		while (lst.hasNext()) {
			Object r = lst.next();
			loger.info("" + r);
		}

		loger.info("**************backward**************");

		while (lst.hasPrevious()) {
			Integer r = lst.previous();
			loger.info("" + r);
		}

		loger.info("**************forloop**************");

		for (int i = 0; i < a.size(); i++) {
			loger.info("" + a);
		}

		loger.info("**************Enumeration**************");

		Enumeration<Integer> lst1 = a.elements();
		while (lst1.hasMoreElements()) {
			Integer r = lst1.nextElement();
			loger.info("" + r);
		}

	}

}
