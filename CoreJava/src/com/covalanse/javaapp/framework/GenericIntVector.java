package com.covalanse.javaapp.framework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class GenericIntVector {
	public static void main(String[] args) {
		Vector<Integer> a = new Vector();
		a.add(20);
		a.add(27);
		a.add(5);
		

		for (Integer d : a) {
			System.out.println(d);
		}
		
		System.out.println("*************ITERATOR**********");

		Iterator<Integer> it = a.iterator();
		while (it.hasNext()) {
			Integer r = it.next();
			System.out.println(r);
		}

		System.out.println("************LISTITERATOR***************");
		
		ListIterator<Integer> lst = a.listIterator();
		while (lst.hasNext()) {
			Object r = lst.next();
			System.out.println(r);
		}
		
		System.out.println("**************backward**************");

		while (lst.hasPrevious()) {
			Integer r = lst.previous();
			System.out.println(r);
		}
		
		System.out.println("**************forloop**************");
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a);
		}
		

		System.out.println("**************Enumeration**************");
		
		Enumeration<Integer> lst1=a.elements();
		while(lst1.hasMoreElements()) {
			Integer r=lst1.nextElement();
			System.out.println(r);
		}
		

	}

}
