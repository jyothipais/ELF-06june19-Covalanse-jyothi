package com.covalanse.javaapp.framework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator4 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();

		a.add(12);
		a.add("eyekiller");
		a.add(22.5);
		a.add('B');

		ListIterator lst = a.listIterator();

		System.out.println(a);

	}
}
