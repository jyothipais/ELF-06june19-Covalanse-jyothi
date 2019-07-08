package com.covalense.javaapp.assessmentprogram;

import java.util.logging.Logger;

public class BMIIMPL {
	final static Logger loger=Logger.getLogger("BMIIMPL");
	public static void main(String[] args) {

		BMI b = (i, j) -> i / (j * j);

		double val = b.bmiCalculator(500, 4.6);

		if (val > 30.0) {
			loger.info("over weight");
		} else if (val > 23.5) {
			loger.info("normal Weight");
		} else if (val > 16) {
			loger.info("obsese");
		} else {
			loger.info("underweight");
		}
	}

}
