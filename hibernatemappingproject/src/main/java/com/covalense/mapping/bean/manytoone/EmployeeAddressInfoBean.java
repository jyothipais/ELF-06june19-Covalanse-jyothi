package com.covalense.mapping.bean.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.covalense.mapping.primarybean.EmployeeInfoBean;

import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Table(name = "employee_address_info")
@Data
public class EmployeeAddressInfoBean implements Serializable {

	@EmbeddedId
	private EmployeeAddressPKBean addressPKBean;
	@Column(name = "ADDRESS_1")
	private String address1;
	@Column(name = "ADDRESS_2")
	private String address2;
	@Column(name = "LANDMARK")
	private String landmark;
	@Column(name = "CITY")
	private String city;
	@Column(name = "STATE")
	private String state;
	@Column(name = "COUNTRY")
	private String country;
	@Column(name = "PINCODE")
	private int pincode;

}
