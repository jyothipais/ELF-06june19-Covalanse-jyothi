package com.covalense.javaapp.threads;

import java.util.logging.Logger;

public class PVR {
	final Logger loger = Logger.getLogger("PVR");

	synchronized void book() {

		for (int i = 0; i <= 5; i++) {
			loger.info("" + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	synchronized void release() {
		notifyAll();
	}
}
