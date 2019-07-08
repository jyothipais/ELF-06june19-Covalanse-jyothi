package com.covalense.javaapp.assessmentprogram;

import java.util.logging.Logger;

public class SingletonImplementation {
	final Logger loger = Logger.getLogger("SingleToneImplementation");
	private static final SingletonImplementation object = new SingletonImplementation();

	private SingletonImplementation() {
		loger.info("Single instance created as soon as class loaded");
	}

	public static SingletonImplementation getInstance() {
		return object;
	}

	public void doAction() {
		loger.info("I am performing the task assigned");
	}

}
