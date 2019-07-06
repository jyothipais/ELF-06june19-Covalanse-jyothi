package com.covalense.javaapp.threads;

import java.util.logging.Logger;

public class Mouse implements Runnable {
	final Logger loger = Logger.getLogger("Mouse  ");
	String name;

	public Mouse(String name) {
		super();
		this.name = name;
	}

	public void run() {
		loger.info("statred" + name);
		for (int i = 0; i <= 5; i++) {
			loger.info("" + i);
			loger.info("Ending" + name);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
