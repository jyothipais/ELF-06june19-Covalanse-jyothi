package com.covalanse.javaapp.assaignments;

import java.util.logging.Logger;

public class Displayoddno {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("Displayoddno  ");
		loger.info("no are divisible by 7 are:");
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				loger.info("" + i);
			}
		}

	}
}
