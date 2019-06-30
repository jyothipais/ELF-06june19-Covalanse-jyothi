package com.covalense.javaapp.inheritence;

import java.util.logging.Logger;

public class LevelA {
	final Logger loger = Logger.getLogger("Level1A");

	void speed() {
		loger.info("car is running at the speed o0-100");
	}
}
