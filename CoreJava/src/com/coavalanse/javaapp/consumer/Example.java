package com.covalense.javaapp.consumer;

import java.util.logging.Logger;

import lombok.extern.java.Log;

@Log
public class Example {
	final static Logger loger = Logger.getLogger("Example  ");
	static void open() {
		loger.info("*********open methos***********");
		loger.info("************LOgic to open********");
	}
	public static void main(String[] args) {
		Remove r=Example :: open;
		r.remove();
	}
}
