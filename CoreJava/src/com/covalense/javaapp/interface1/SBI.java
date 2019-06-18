package com.covalense.javaapp.interface1;
public class SBI implements ATMcard {
	public void validate() {
		System.out.println("validation done in SBI bank");
	}

	public void getdata() {
		System.out.println("data received by the  SBI bank");
	}
}
