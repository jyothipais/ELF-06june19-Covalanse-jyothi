package com.covalanse.javaapp.framework;

import java.util.ArrayList;
import java.util.logging.Logger;

public class ArrayList1 {
	final static Logger loger = Logger.getLogger("ArrayList1 ");

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(12);
		a.add("eyekiller");
		a.add(22.5);
		a.add("B");

		for (int i = 0; i < a.size(); i++) {
			Object r = a.get(i);
			loger.info("" + r);
		}

	}
}
