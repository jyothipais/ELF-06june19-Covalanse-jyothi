package com.covalense.javaapp.inheritence;

public class Writinginmarker extends Writng {
	void wrt() {
		System.out.println("Writing using marker");
	}

	public static void main(String[] args) {
		Writng w = new Writinginmarker();
		w.wrt();
	}

}
