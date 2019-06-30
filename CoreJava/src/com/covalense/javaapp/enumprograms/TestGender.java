package com.covalense.javaapp.enumprograms;
import java.util.logging.Logger;

public class TestGender {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("TestGender  ");
		 Gender g=Gender.FEMALE;
		 
		 switch(g) {
		 case MALE :loger.info("s it's MALE");
		 break;
		 case FEMALE :loger.info("s it's FEMALE");
		 break;
		 case OTHER :loger.info("s it's OTHER");
		 break;
		 }
	}

}
