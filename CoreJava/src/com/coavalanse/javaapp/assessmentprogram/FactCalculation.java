package com.covalense.javaapp.assessmentprogram;

import java.util.logging.Logger;

public class FactCalculation {
	final static Logger loger=Logger.getLogger("FactCalculation");
	public static void main(String[] args) {
		CalculateFactorial cf = new CalculateFactorial();
		
		
		loger.info("Fact Without Lambda  "+cf.calculateFact(5));
		loger.info("Fact With Lambda  "+cf.lambdaFact(5));
		
	}

}
