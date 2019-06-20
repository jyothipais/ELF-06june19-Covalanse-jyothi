package com.covalanse.javaapp.framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class GenericStringTypeArrayListUsingIterator1 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList();
		a.add("eyekiller");
		a.add("sara");
		a.add("minikutty");

		for (String d : a) {
			System.out.println(d);
		}
		System.out.println("*************ITERATOR**********");

		Iterator<String> it = a.iterator();
		while (it.hasNext()) {
			String r = it.next();
			System.out.println(r);
		}

		System.out.println("************LISTITERATOR***************");
		ListIterator<String> lst = a.listIterator(a.size());
		while (lst.hasNext()) {
			String r = lst.next();
			System.out.println(r);
		}
		System.out.println("**************backward**************");

		while (lst.hasPrevious()) {
			String r = lst.previous();
			System.out.println(r);
		}
	}
}
