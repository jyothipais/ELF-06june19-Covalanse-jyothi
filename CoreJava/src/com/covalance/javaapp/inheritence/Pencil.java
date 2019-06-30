package com.covalance.javaapp.inheritence;

import java.util.logging.Logger;

public abstract class Pencil {
	final Logger loger = Logger.getLogger(" Pencil  ");

	void draw() {
		loger.info("drawing from pencil in pencil class");
	}

	abstract void write();

	abstract void color();
}
