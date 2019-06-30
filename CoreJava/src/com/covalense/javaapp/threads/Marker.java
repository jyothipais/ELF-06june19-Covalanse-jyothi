package com.covalense.javaapp.threads;

import java.util.logging.Logger;

public class Marker implements Runnable {
	final Logger loger = Logger.getLogger("Marker ");

	public void run() {
		for (int i = 0; i < 5; i++) {
			loger.info("" + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
