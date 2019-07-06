package com.covalance.javaapp.array;

import java.util.logging.Logger;

public class Arrayprgm2 {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("Arrayprgm2 ");
		int[] a = { 10, 35, 22 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		loger.info("*********************************************");

	}
}
