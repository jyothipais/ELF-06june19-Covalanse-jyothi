package com.covalanse.javaapp.exception;

public class Nameexception extends Exception {
	private String name;

	public Nameexception(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

}
