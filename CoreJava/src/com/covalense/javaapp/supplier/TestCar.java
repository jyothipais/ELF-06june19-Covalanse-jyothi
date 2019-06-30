package com.covalense.javaapp.supplier;

import java.util.function.Supplier;
import java.util.logging.Logger;

import lombok.extern.java.Log;

@Log
public class TestCar {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("TestCar ");
		Supplier<Car> s=()->new Car(100);
		Car c =s.get();
	loger.info(""+c.fuel);
		
	}

}
