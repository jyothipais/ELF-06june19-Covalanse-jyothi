package com.covalanse.javaapp.framework;

import java.util.ArrayList;
import java.util.logging.Logger;

public class GenericTYpeArrayListUsingForeach {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("GenericTYpeArrayListUsingForeach");
		ArrayList<Double> a = new ArrayList<Double>();
		a.add(22.8);
		a.add(31.9);

		for (Double d : a) {
			loger.info("" + d);
		}
	}
}
