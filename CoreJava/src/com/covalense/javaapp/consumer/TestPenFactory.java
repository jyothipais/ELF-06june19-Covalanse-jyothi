package com.covalense.javaapp.consumer;

public class TestPenFactory {
	public static void main(String[] args) {
		PenFactoryProgram p = PenFactory::new;
		PenFactory a = p.getPen();
	}
}
