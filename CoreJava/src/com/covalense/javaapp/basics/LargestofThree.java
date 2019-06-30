package com.covalense.javaapp.basics;

import java.util.logging.Logger;

public class LargestofThree {
	final static Logger loger = Logger.getLogger("LargestofThree");
	public static void main(String[] args) {
		int a = 30;
		int b = 28;
		int c = 44;
		if (a > b && a > c) {
			loger.info("A is Latrgest");
		} else if (b > c) {
			loger.info("B is  Largest");
		} else {
			loger.info("C is Largest");
		}
	}

}
