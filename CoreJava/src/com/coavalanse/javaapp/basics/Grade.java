package com.covalense.javaapp.basics;

import java.util.logging.Logger;

public class Grade {
	final static Logger loger = Logger.getLogger("Grade");
	public static void main(String[] args) {
		double score = 45;
		if (score > 85) {
			loger.info("grade +a");
		} else if (score > 60) {
			loger.info("Grade is B");
		} else if (score > 35) {
			loger.info("Grade is C");
		} else {
			loger.info("Grade is D");
		}
	}

}
