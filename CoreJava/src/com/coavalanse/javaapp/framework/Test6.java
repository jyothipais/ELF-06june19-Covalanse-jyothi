package com.covalanse.javaapp.framework;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Test6 {
	public static void main(String[] args) {
		final  Logger loger = Logger.getLogger("Test6");
		ArrayList<Double> a = new ArrayList<Double>();
		a.add(9.2);
		a.add(1.5);
		a.add(6.9);
		a.add(2.4);
		a.add(3.6);
		
		ArrayList<Double> b= new ArrayList<Double>();
		b.add(154.67);
		b.add(786.87);
		
		loger.info("******BEFORE********"+a);
		
		a.addAll(b);
		
		loger.info("******AFTER********"+a);
	}

}
