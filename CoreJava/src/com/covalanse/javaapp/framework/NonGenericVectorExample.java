package com.covalanse.javaapp.framework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class NonGenericVectorExample {
	public static void main(String[] args) {
		Vector a = new Vector();
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
		
		System.out.println("**************forloop**************");
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a);
		}
		
		System.out.println("**************Enumeration**************");
		
		Enumeration lst1=a.elements();
		while(lst1.hasMoreElements()) {
			Object  r=lst1.nextElement();
			System.out.println(r);
		}
		
	}

}
