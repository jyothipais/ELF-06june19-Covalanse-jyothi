package com.covalense.javaapp.assessmentprogram;

import java.util.logging.Logger;

public class ThreadCreation implements Runnable {
	final static Logger loger = Logger.getLogger("ThreadCreation");

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				loger.info("" + e);
			}
			loger.info("" + i);
		}
	}
}