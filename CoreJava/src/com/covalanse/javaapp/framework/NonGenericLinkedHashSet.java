package com.covalanse.javaapp.framework;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class NonGenericLinkedHashSet {
public static void main(String[] args) {
	LinkedHashSet hs=new LinkedHashSet();
	hs.add(29);
	hs.add("Eye Killer");
	hs.add(55.7);
	
	for(Object r:hs) {
		System.out.println(r);
	}
	
	System.out.println("********** ITERATOR**********");
	
	Iterator it=hs.iterator();
	while(it.hasNext()) {
		Object r=it.next();
		System.out.println(r);
	}
}
}
