package com.covalanse.javaapp.objectoriented;

import java.util.logging.Logger;

public class Testcollage {
	final static Logger loger = Logger.getLogger("TestCollage");
	public static void main(String[] args) {
		Collage.s.play();
		Collage.s.name = "anitta";
		loger.info("");
	}

}
