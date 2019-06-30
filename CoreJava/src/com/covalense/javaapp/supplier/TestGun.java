package com.covalense.javaapp.supplier;

import java.util.function.Supplier;
import java.util.logging.Logger;

import lombok.extern.java.Log;
@Log
public class TestGun {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("TestGun  ");
		Supplier<Gun> s=()->new Gun(100);
		Gun g=s.get();
	loger.info(""+g.a);
				
	}

}
