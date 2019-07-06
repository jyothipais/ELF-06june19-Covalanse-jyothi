package com.covalense.javaapp.inheritence;

import java.util.logging.Logger;

public class Childclass extends Singleinheritence {
	final Logger loger = Logger.getLogger("Childclass");

	void child() {
		loger.info("Imk a child class content");
	}

	public static void main(String[] args) {
		Childclass c = new Childclass();
		c.child();
		c.parent();
	}
}
