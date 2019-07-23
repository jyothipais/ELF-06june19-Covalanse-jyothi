package com.covalense.spring.bean;

import com.covalense.spring.interfaces.StorageDevice;

import lombok.extern.java.Log;

@Log
public class PenDrive implements StorageDevice{
	private int capacity;
	private double writingSpeed;
	private double readingSpeed;

	public void write() {
		log.info("HardDisk write() method ");
	}// End of write()

	public void read() {
		log.info("HardDisk read() method ");
	}// End of read()

	public void format() {
		log.info("HardDisk format() method ");
	}// End of format()
}
