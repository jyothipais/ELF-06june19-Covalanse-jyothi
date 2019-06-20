package com.covalanse.javaapp.framework;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class GenericLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<Integer> hs=new LinkedHashSet();
		hs.add(29);
		hs.add(48);
		hs.add(89);
		
		for(Integer r:hs) {
			System.out.println(r);
		}
		
		System.out.println("********** ITERATOR**********");
		
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext()) {
			Integer r=it.next();
			System.out.println(r);
		}
	}

}
