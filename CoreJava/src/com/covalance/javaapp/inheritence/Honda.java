package com.covalance.javaapp.inheritence;

import java.util.logging.Logger;

public abstract class Honda {
	final Logger loger = Logger.getLogger(" Honda ");

	void engine() {
		loger.info("Im a engine method of Honda class");
	}

	abstract void design();

}
