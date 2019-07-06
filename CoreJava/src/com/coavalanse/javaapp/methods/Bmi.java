package com.covalanse.javaapp.methods;

import java.util.logging.Logger;

public class Bmi {
	final static Logger loger = Logger.getLogger("Bmi");
	double h, w, bmi;

	double calculation() {
		double bmi = w / (h * h);
		return bmi;
	}

	void calc() {
		if (bmi >= 30)
			loger.info("OBESE");
		else if (bmi >= 25)
			loger.info("OVERWEIGHT");
		else if (bmi >= 18.5)
			loger.info("NORMAL");
		else
			loger.info("under weight");

	}

	public static void main(String[] args) {
		Bmi b = new Bmi();
		b.h = 2;
		b.w = 100;
		b.calculation();
		b.calc();

	}
}
