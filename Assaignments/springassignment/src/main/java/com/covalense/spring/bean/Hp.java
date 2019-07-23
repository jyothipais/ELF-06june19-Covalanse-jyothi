package com.covalense.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;

import com.covalense.spring.interfaces.Laptop;
import com.covalense.spring.interfaces.StorageDevice;

import lombok.extern.java.Log;

@Log
public class Hp implements Laptop {
	private String brand;
	private String color;
	private double cost;
	private double weight;
	private double ram;
	private String os;
	@Autowired
	private StorageDevice storageDevice;

	public void display() {
		log.info("HP display() method ");

	}// End of display()

	public void process() {
		log.info("HP process() method ");

	}// End of process()

	public void showSpecification(String brand, double ram, String os, double cost) {
		log.info("HP Brand is :" + brand);
		log.info("HP RAM is :" + ram);
		log.info("HP OS is :" + os);
		log.info("HP Cost is :" + cost);
	}// End of showSpecification()

	public void getStorage() {

		storageDevice.write();
		storageDevice.read();
		storageDevice.format();

	}// End of getStorage()

}
