package com.covalense.javaapp.consumer;

public class TestAvgMethod {
	public static void main(String[] args) {
		AverageMethod a=new AverageMethod ();
		
		Average b=a::calculate;
		a.calculate(22,24,23);
		
		
	}

}
