package com.covalense.javaapp.asessment;

import java.util.logging.Logger;

public class Pen {
	final Logger loger = Logger.getLogger("Pen");
	String color = "blue";
	double cost = 20;

	void display() {
		loger.info("Pen color is" + color);
		loger.info("Pen cost is" + cost);
	}

}
