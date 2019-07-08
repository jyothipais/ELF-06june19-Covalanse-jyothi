package com.covalense.javaapp.assessmentprogram;

import java.util.logging.Logger;

public class CalculateSimpleInterestByLambdaEx {
	final static Logger loger=Logger.getLogger("CalculateSimpleInterestByLambdaEx");
	public static void main(String[] args) {
		int principle = 9000;
		double rate = 7.5;
		int year = 2;
		SimpleInterestCalculation s = (p, r, y) -> (p * r * y) / 100;
		double res = s.calculateSI(principle, rate, year);
		loger.info("Simple Interest is " + res);
	}
}
