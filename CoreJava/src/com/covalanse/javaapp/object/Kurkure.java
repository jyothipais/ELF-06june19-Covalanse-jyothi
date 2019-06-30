package com.covalanse.javaapp.object;

import java.util.logging.Logger;

public class Kurkure extends Baby {
	final  Logger loger = Logger.getLogger("Baby");
	void open() {
		loger.info("open the Kurkure");
	}

	public static void main(String[] args) {
		Kurkure k = new Kurkure();
		k.open();
		Lays a = new Lays();
		a.open();

	}
}
