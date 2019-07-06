package com.covalance.javaapp.array;

import java.util.logging.Logger;

public class IntTypeArray {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("IntTypeArray ");
		int[] a = { 2, 9, 4, 1, 0, 5 };

		for (int r : a) {
			loger.info("" + r);
		}
	}

}
