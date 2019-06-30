package com.covalense.javaapp.inheritence;

import java.util.logging.Logger;

public class LevelC extends LevelB {
	final Logger loger = Logger.getLogger("Level2");

	void speed() {
		loger.info("car is running at the speed o0-200");

	}

	public static void main(String[] args) {
		LevelC l = new LevelC();
		l.speed();
	}
}
