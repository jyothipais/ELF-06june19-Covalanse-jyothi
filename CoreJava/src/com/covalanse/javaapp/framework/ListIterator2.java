package com.covalanse.javaapp.framework;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.logging.Logger;

public class ListIterator2 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		final  Logger loger = Logger.getLogger("ListIterator2");
		ArrayList a = new ArrayList();

		a.add(12);
		a.add("eyekiller");
		a.add(22.5);
		a.add('B');

		ListIterator lst = a.listIterator(a.size());
		
		loger.info("**************backward**************");

		while (lst.hasPrevious()) {
			Object r = lst.previous();
			loger.info(""+r);

		}
	}
}
