package com.covalense.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.spring.config.LaptopConfig;
import com.covalense.spring.interfaces.Laptop;

import lombok.extern.java.Log;

@Log
public class LaptopTest {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(LaptopConfig.class);
		Laptop dell = context.getBean(Laptop.class);
		
		log.info("");
	}

}
