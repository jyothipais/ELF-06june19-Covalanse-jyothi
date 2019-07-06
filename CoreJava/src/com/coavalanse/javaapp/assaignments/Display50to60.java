package com.covalanse.javaapp.assaignments;

import java.util.logging.Logger;

public class Display50to60 {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("Display50to60 ");
		for (int i = 50; i <= 60; i++) {
			loger.info("" + i);
		}
	}
}
