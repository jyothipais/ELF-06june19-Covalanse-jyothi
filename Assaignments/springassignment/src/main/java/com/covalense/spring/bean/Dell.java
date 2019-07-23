package com.covalense.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;

import com.covalense.spring.interfaces.Laptop;
import com.covalense.spring.interfaces.StorageDevice;

import lombok.extern.java.Log;

@Log
public class Dell implements Laptop {
	private String brand;
	private String color;
	private double cost;
	private double weight;
	private double ram;
	private String os;
	@Autowired
	private StorageDevice storageDevice;

	public void display() {
		log.info("Dell display() method ");
		
	}//End of display()

	public void process() {
		log.info("Dell process() method ");
	}//End of process()

	public void showSpecification(String brand, double ram, String os, double cost) {
		
		log.info("Dell Brand is :" + brand);
		log.info("Dell RAM is :" + ram);
		log.info("Dell OS is :" + os);
		log.info("Dell Cost is :" + cost);
		
	}//End of showSpecification()
	
	public void getStorage() {
		
		storageDevice.write();
		storageDevice.read();
		storageDevice.format();
		
	}//End of getStorage()


}
