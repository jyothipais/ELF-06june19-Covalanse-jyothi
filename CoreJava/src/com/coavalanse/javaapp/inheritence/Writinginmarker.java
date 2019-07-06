package com.covalense.javaapp.inheritence;

import java.util.logging.Logger;

public class Writinginmarker extends Writng {
	final Logger loger = Logger.getLogger("Writinginmarker");

	void wrt() {
		loger.info("Writing using marker");
	}

	public static void main(String[] args) {
		Writng w = new Writinginmarker();
		w.wrt();
	}

}
