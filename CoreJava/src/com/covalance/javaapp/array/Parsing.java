package com.covalance.javaapp.array;

import java.util.logging.Logger;

public class Parsing {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger(" Parsing ");
		String p = "4.2";
		int i = Integer.parseInt(p);
		String q = "2";
		int j = Integer.parseInt(q);
		loger.info(p + q);
	}

}
