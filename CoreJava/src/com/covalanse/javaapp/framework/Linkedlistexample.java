package com.covalanse.javaapp.framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.logging.Logger;

public class Linkedlistexample {
	public static void main(String[] args) {
		final  Logger loger = Logger.getLogger("Linkedlistexample ");
		LinkedList a = new LinkedList();
		a.add("eyekiller");
		a.add("33.5");
		a.add('B');

		for (Object d : a) {
			loger.info(""+d);
		}
		loger.info("*************ITERATOR**********");

		Iterator it = a.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			loger.info(""+r);
		}

		loger.info("************LISTITERATOR***************");
		ListIterator lst = a.listIterator(a.size());
		while (lst.hasNext()) {
			Object r = lst.next();
			loger.info(""+r);
		}
		loger.info("**************backward**************");

		while (lst.hasPrevious()) {
			Object r = lst.previous();
			loger.info(""+r);
		}
		
		loger.info("**************forloop**************");
		
		for(int i=0;i<a.size();i++) {
			loger.info(""+a);
		}
		
	}

}
