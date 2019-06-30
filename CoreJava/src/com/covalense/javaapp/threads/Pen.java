package com.covalense.javaapp.threads;

import java.util.logging.Logger;

public class Pen extends Thread {
	final Logger loger = Logger.getLogger("Pen ");

	@Override
	public void run() {
		String s = getName();
		loger.info("----------------->" + s);
		for (int i = 0; i <= 5; i++) {
			loger.info("" + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
