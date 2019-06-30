package com.covalanse.javaapp.framework;

import java.util.ArrayList;
import java.util.logging.Logger;

public class GenericArrayList {
	final static Logger loger = Logger.getLogger("GenericArrayList");

	public static void main(String[] args) {
		ArrayList<Double> a = new ArrayList<Double>();
		a.add(22.8);
		a.add(31.9);
		for (int i = 0; i < a.size(); i++) {
			Double d = a.get(i);
			loger.info("" + d);
		}
	}

}
