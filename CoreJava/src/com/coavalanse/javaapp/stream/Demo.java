package com.covalense.javaapp.stream;

import java.util.logging.Logger;

public interface Demo {
	void print(int x);
}

class Pen {
	final static Logger loger = Logger.getLogger("Pen");

	void write(int x) {
		loger.info("" + x);
	}

	public static void main(String[] args) {
		Demo a = x -> loger.info("" + x);
		a.print(5);
	}
}