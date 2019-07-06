package com.covalense.javaapp.threads;

import java.util.logging.Logger;

public class TestPen {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("TestPen");
		loger.info("****Main started****");
		Pen p = new Pen();
		p.setName("Eye_Killer");
		p.start();
		Pen p1 = new Pen();
		p.setName("nickey");
		p1.start();
		Pen p2 = new Pen();
		p.setName("sara");
		p2.start();
		loger.info("****Main ended****");
	}

}
