package com.covalanse.javaapp.framework;

import java.util.HashSet;
import java.util.Iterator;

public class NonGenericHashset {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(27);
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
