package com.covalanse.javaapp.framework;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Array1 {
	final static Logger loger = Logger.getLogger("Array1");
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
	
		a.add(12);
		a.add("eyekiller");
		a.add(22.5);
		a.add('B');
		
		for(Object o:a) {
			loger.info(""+o);
		}
	}

 
}
