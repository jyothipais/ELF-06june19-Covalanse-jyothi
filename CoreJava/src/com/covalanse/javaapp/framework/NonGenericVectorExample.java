package com.covalanse.javaapp.framework;

import java.util.Enumeration;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
import java.util.logging.Logger;

public class NonGenericVectorExample {
	public static void main(String[] args) {
		final  Logger loger = Logger.getLogger("NonGenericVectorExample");
		Vector a = new Vector();
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
	
		ListIterator lst = a.listIterator();
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
		
		loger.info("**************Enumeration**************");
		
		Enumeration lst1=a.elements();
		while(lst1.hasMoreElements()) {
			Object  r=lst1.nextElement();
			loger.info(""+r);
		}
		
	}

}
