package com.covalanse.javaapp.framework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator3 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();

		a.add(12);
		a.add("eyekiller");
		a.add(22.5);
		a.add('B');

		ListIterator lst = a.listIterator();
		while (lst.hasNext()) {
			Object r = lst.next();
			System.out.println(r);
		}
		System.out.println("**************backward**************");

		while (lst.hasPrevious()) {
			Object r = lst.previous();
			System.out.println(r);

		}
	}
}
