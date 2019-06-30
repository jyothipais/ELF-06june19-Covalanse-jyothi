package com.covalanse.javaapp.exception;

public class Nameexception extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	public Nameexception(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

}
