package com.covalanse.javaapp.casting;

import java.util.logging.Logger;

public class Testanimal {
	final static Logger loger = Logger.getLogger("Testaniaml");
	public static void main(String[] args) {
		Animal a = new Cow();
		a.eat();
		Cow c = (Cow) a;
		c.eat();
		c.run();
		c.i = 5;
		c.j = 44;
		loger.info(""+c.i);
		loger.info(""+c.j);

	}

}
