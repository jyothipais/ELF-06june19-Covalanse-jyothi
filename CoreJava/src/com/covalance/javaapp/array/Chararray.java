package com.covalance.javaapp.array;

import java.util.logging.Logger;

public class Chararray {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("Chararray ");
		char[] c = new char[8];

		c[0] = 'j';
		c[1] = 'y';
		c[2] = 'o';
		c[3] = 't';
		c[4] = 'h';
		c[5] = 'i';
		for (int i = 0; i <= c.length; i++)
		loger.info("" + c[i]);
		loger.info("" + c.length);
	}

}
