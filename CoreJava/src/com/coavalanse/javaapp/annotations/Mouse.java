package com.covalense.javaapp.annotations;

import java.util.logging.Logger;

public class Mouse{
	final Logger loger = Logger.getLogger("Mouse");
	void click() {
		System.out.println("Im a click");
	}
	@Deprecated
	void scroll() {
		loger.info("Im a scroll");
	}
	void doubleclick() {
		loger.info("Im a doubleclick");
	}

}
