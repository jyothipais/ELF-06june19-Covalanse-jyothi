package com.covalanse.javaapp.framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class NonGenericTreeset {
	public static void main(String[] args) {
		TreeSet hs = new TreeSet();
		hs.add(29);
		hs.add(77);
		hs.add(99);

		for (Object r : hs) {
			System.out.println(r);
		}

		System.out.println("********** ITERATOR**********");

		Iterator it = hs.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
		}
	}

}
