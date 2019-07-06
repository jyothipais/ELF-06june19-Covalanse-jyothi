package com.covalense.javaapp.annotations;

import java.util.logging.Logger;

public class TestMyArrayClass {
	private static final Logger logger = Logger.getLogger("TestMyArrayClass");

	public static void main(String[] args) {
		MyArrayClass myArrayClass = new MyArrayClass();
		int dataSize = 8;
	
		for (int i = 0; i < dataSize; i++) {
			myArrayClass.add(i);
		}
		myArrayClass.remove(04);

		for (int i = 0; i < dataSize; i++) {
			logger.info("retriving element" + myArrayClass.get(i));
		}
		}
}
