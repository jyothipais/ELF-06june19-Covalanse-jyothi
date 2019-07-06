package com.covalanse.javaapp.framework;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.logging.Logger;

public class ListIterator4 {
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		final  Logger loger = Logger.getLogger("ListIterator4");
		ArrayList a = new ArrayList();

		a.add(12);
		a.add("eyekiller");
		a.add(22.5);
		a.add('B');

		ListIterator lst = a.listIterator();

		loger.info(""+a);

	}
}
