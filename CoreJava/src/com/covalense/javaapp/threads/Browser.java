package com.covalense.javaapp.threads;

public class Browser extends Thread {
	PVR ref;

	public Browser(PVR ref) {
		super();
		this.ref = ref;
	}
	public void run() {
		ref.book();
	}

}
