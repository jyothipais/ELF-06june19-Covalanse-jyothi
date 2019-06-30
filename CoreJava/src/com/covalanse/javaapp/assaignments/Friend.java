package com.covalanse.javaapp.assaignments;

import java.util.logging.Logger;

public class Friend {
	final Logger loger = Logger.getLogger("Friend ");
	void receive(Gift g) {
		loger.info("received gift");
	}

}
