package com.covalanse.javaapp.framework;

import java.util.HashSet;
import java.util.Iterator;

public class GenericHashSet {
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet();
		hs.add(27);
		hs.add(44);
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
