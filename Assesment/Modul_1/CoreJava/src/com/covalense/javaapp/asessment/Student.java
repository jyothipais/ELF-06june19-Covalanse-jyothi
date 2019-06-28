package com.covalense.javaapp.asessment;

import java.util.logging.Logger;

public class Student {
	final Logger loger = Logger.getLogger("Student");
	private String name;
	private int id;
	private double percentage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	void validation() {
		double Eligibility = 8.0;
		if (percentage > Eligibility) {
			loger.info("Allow for the Exam");
		} else {
			loger.info("Dont allow them to Exam");
		}
	}

}
