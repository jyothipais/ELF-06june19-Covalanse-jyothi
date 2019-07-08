package com.covalense.javaapp.assessmentprogram;

import java.util.logging.Logger;

public class ImmutableTest {
final static Logger loger=Logger.getLogger("ImmutableTest ");
	public static void main(String[] args) {

		ImmutableClassCreation imc = new ImmutableClassCreation(21,"priya");
		
		loger.info("" + imc.getAge());
	}

}
