package com.covalense.javaapp.inheritence;

import java.util.logging.Logger;

public class LevelB extends LevelA {
	void speed() {
		final Logger loger = Logger.getLogger("LevelB");
		loger.info("car is running at the speed o0-150");
	}
}
