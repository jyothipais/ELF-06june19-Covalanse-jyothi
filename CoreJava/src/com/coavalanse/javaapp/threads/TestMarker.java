package com.covalense.javaapp.threads;

public class TestMarker {
	public static void main(String[] args) {
		Marker m1 = new Marker();
		Thread t = new Thread(m1);
		t.start();
	}

}
