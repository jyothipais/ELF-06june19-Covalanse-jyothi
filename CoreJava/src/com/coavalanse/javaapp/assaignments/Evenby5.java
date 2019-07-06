package com.covalanse.javaapp.assaignments;

import java.util.logging.Logger;

public class Evenby5 {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("Evenby5 ");
		
		loger.info("no are divisible by 5 are:");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				if (i % 5 == 0) {
					loger.info(""+i);
				}
			}
		}
	}

}
