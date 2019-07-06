package com.covalanse.javaapp.framework;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Test5 {
	public static void main(String[] args) {
		final  Logger loger = Logger.getLogger("Test5");
		ArrayList<Double> a = new ArrayList<Double>();
		a.add(9.2);
		a.add(1.5);
		a.add(6.9);
		a.add(2.4);
		a.add(3.6);
		
		loger.info("******BEFORE********"+a);
		
		boolean r=a.remove(2.4);
		loger.info("Removed object is :"+r);

		
		loger.info("******AFTER********"+a);
	}

}
