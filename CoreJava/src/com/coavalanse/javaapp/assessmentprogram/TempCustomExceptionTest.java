package com.covalense.javaapp.assessmentprogram;

public class TempCustomExceptionTest {
	public static void main(String[] args) {
		double temp=25.00;
		TempCustomException c =new TempCustomException();
		c.validateServerRoomTemp(temp);
	}

}
