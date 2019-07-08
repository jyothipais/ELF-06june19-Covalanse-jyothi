package com.covalense.designpattern.builder;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public final class EmployeeData2 {
	private int ID;
	private String NAME;
	private int AGE;
	private String GENDER;
	private double SALARY;
	private int PHONE;
	private Date JOINING_DATE;
	private int ACCOUNT_NUMBER;
	private String EMAIL;
	private String DESIGNATION;
	private Date DOB;
	private int DEPT_ID;
	private int MNGR_ID;

	private EmployeeData2(EmployeeData2builder builder) {
		ID = builder.ID;
		NAME = builder.NAME;
		AGE = builder.AGE;
		GENDER = builder.GENDER;
		SALARY = builder.SALARY;
		PHONE = builder.PHONE;
		JOINING_DATE = builder.JOINING_DATE;
		ACCOUNT_NUMBER = builder.ACCOUNT_NUMBER;
		EMAIL = builder.EMAIL;
		DESIGNATION = builder.DESIGNATION;
		DOB = builder.DOB;
		DEPT_ID = builder.DEPT_ID;
		MNGR_ID = builder.MNGR_ID;

	}

	public static class EmployeeData2builder {
		private int ID;
		private String NAME;
		private int AGE;
		private String GENDER;
		private double SALARY;
		private int PHONE;
		private Date JOINING_DATE;
		private int ACCOUNT_NUMBER;
		private String EMAIL;
		private String DESIGNATION;
		private Date DOB;
		private int DEPT_ID;
		private int MNGR_ID;

		public EmployeeData2builder ID(int ID) {
			this.ID = ID;
			return this;
		}

		public EmployeeData2builder NAME(String NAME) {
			this.NAME = NAME;
			return this;
		}

		public EmployeeData2builder AGE(int AGE) {
			this.AGE = AGE;
			return this;
		}

		public EmployeeData2builder GENDER(String GENDER) {
			this.GENDER = GENDER;
			return this;
		}

		public EmployeeData2builder SALARY(Double SALARY) {
			this.SALARY = SALARY;
			return this;
		}

		public EmployeeData2builder PHONE(int PHONE) {
			this.PHONE = PHONE;
			return this;
		}

		public EmployeeData2builder JOINING_DATE(Date JOINING_DATE) {
			this.JOINING_DATE = JOINING_DATE;
			return this;
		}

		public EmployeeData2builder ACCOUNT_NUMBER(int ACCOUNT_NUMBER) {
			this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
			return this;
		}

		public EmployeeData2builder EMAIL(String EMAIL) {
			this.EMAIL = EMAIL;
			return this;
		}

		public EmployeeData2builder DESIGNATION(String DESIGNATION) {
			this.DESIGNATION = DESIGNATION;
			return this;
		}

		public EmployeeData2builder DOB(Date DOB) {
			this.DOB = DOB;
			return this;
		}

		public EmployeeData2builder DEPT_ID(int DEPT_ID) {
			this.DEPT_ID = DEPT_ID;
			return this;
		}

		public EmployeeData2builder MNGR_ID(int MNGR_ID) {
			this.MNGR_ID = MNGR_ID;
			return this;
		}

		public EmployeeData2 build() {
			return new EmployeeData2(this);
		}
	}

}
