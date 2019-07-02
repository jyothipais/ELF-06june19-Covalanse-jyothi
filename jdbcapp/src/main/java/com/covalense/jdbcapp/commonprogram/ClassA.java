package com.covalense.jdbcapp.commonprogram;

import lombok.extern.java.Log;

@Log
public class ClassA implements Connection {
	@Override
	public void printMessage() {
		log.info("AAAAAAA");
	}
	
}
