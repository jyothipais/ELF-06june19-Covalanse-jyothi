package com.covalense.javaapp.basics;

import java.util.logging.Logger;

public class bmicalculation {
	final static Logger loger = Logger.getLogger("bmicalculation");
	public static void main(String[] args) {
		double weight = 100, height = 2.7, BMI = weight / (height * height);

	loger.info("weight");
	loger.info(" heighis");
	loger.info(" BMI is" + BMI);
	}

}
