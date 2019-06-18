package com.covalense.javaapp.constructor;

public class Girl {
	void receive(Phone p) {
		if (p instanceof Iphone) {
			System.out.println("I LOVE U");
		} else if (p instanceof Mi) {
			System.out.println("THANK U BROTHER");
		}

	}
}
