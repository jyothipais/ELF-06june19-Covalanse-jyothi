package com.covalense.javaapp.inheritence;

import java.util.logging.Logger;

public class Marker extends Pen {
	final Logger loger = Logger.getLogger("Marker");

	void color() {
		loger.info("Marker color is BLACK");
	}

	public static void main(String[] args) {
		Marker q = new Marker();
		q.color();
		q.write();

		Pen p = new Pen();
		p.write();

		Pen r = new Marker();
		r.write();
		// r.color();

	}
}
