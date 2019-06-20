package com.covalanse.javaapp.methods;

public class Bmi {
	double h, w, bmi;

	double calculation() {
		double bmi = w / (h * h);
		return bmi;
	}

	void calc() {
		if (bmi >= 30)
			System.out.println("OBESE");
		else if (bmi >= 25)
			System.out.println("OVERWEIGHT");
		else if (bmi >= 18.5)
			System.out.println("NORMAL");
		else
			System.out.println("under weight");

	}

	public static void main(String[] args) {
		Bmi b = new Bmi();
		b.h = 2;
		b.w = 100;
		b.calculation();
		b.calc();

	}
}
