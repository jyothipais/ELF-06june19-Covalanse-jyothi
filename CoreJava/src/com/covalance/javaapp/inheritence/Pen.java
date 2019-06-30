package com.covalance.javaapp.inheritence;

import java.util.logging.Logger;

abstract class Pen extends Pencil {
	final Logger loger = Logger.getLogger(" Pencil  ");
	void write() {
		loger.info("writing by using pencil in pen class");

	}
}
