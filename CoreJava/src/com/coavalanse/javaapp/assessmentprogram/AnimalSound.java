package com.covalense.javaapp.assessmentprogram;

import java.util.logging.Logger;

public class AnimalSound {
	final Logger loger=Logger.getLogger("AnimalSound");
	void getSound(Animal a) {
		if (a instanceof Dog) {
			a.sound();
		} else if (a instanceof Cat) {
			a.sound();
		} else {
			loger.info("Pass the correct Option");
		}
	}

}
