package com.covalanse.javaapp.framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.logging.Logger;

public class NonGenericHashset {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		final  Logger loger = Logger.getLogger("NonGenericHashset");
		HashSet hs=new HashSet();
		hs.add(27);
		hs.add("Eye Killer");
		hs.add(55.7);
		
		for(Object r:hs) {
			loger.info(""+r);
		}
		
		loger.info("********** ITERATOR**********");
		
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			Object r=it.next();
			loger.info(""+r);
		}
	}

}
