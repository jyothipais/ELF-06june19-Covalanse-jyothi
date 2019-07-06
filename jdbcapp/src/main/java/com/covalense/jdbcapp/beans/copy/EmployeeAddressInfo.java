package com.covalense.jdbcapp.beans.copy;

import lombok.Data;

@Data
public class EmployeeAddressInfo {
	private int ID;                	
	private String ADDRESS_TYPE;   
	private String ADDRESS_1;        
	private String ADDRESS_2;        
	private String LANDMARK;         
	private String CITY;            
	private String STATE;           
	private String COUNTRY;          
	private int PINCODE;               


}
