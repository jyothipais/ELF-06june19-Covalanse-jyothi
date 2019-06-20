package com.covalanse.javaapp.framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlistexample {
	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		a.add("eyekiller");
		a.add("33.5");
		a.add('B');

		for (Object d : a) {
			System.out.println(d);
		}
		System.out.println("*************ITERATOR**********");

		Iterator it = a.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
		}

		System.out.println("************LISTITERATOR***************");
		ListIterator lst = a.listIterator(a.size());
		while (lst.hasNext()) {
			Object r = lst.next();
			System.out.println(r);
		}
		System.out.println("**************backward**************");

		while (lst.hasPrevious()) {
			Object r = lst.previous();
			System.out.println(r);
		}
		
		System.out.println("**************forloop**************");
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a);
		}
		
	}

}
