package com.covalanse.javaapp.assaignments;

import java.util.logging.Logger;

public class Primeornot {
	final static Logger loger = Logger.getLogger("Primeornot");
	public static void main(String[] args) {
		int i, m = 0, flag = 0;
		int n = 3;
		m = n / 2;
		if (n == 0 || n == 1) {
			loger.info(n + "is not prime no");
		} else {
			for (i = 2; i <= m; i++) {
				loger.info(n + "is not prime no");
				flag = 1;
				break;
			}
			if (flag == 0) {
				loger.info(n + "is prime number");
			}
		}
	}
}
