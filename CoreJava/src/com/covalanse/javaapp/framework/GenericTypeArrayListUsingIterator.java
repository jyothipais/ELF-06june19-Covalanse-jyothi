package com.covalanse.javaapp.framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

public class GenericTypeArrayListUsingIterator {
	public static void main(String[] args) {
		final  Logger loger = Logger.getLogger("GenericTypeArrayListUsingIterator ");
		ArrayList<Double> a = new ArrayList<Double>();
		a.add(22.8);
		a.add(35.9);
		
		Iterator<Double> it=a.iterator();
		while(it.hasNext()) {
			Double r= it.next();
			loger.info(""+r);
	}
	}

}
