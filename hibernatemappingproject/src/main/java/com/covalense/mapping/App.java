package com.covalense.mapping;

import java.text.ParseException;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import com.covalense.mapping.bean.manytomany.TrainingInfo;
import com.covalense.mapping.bean.manytoone.EmployeeAddressInfoBean;
import com.covalense.mapping.bean.manytoone.EmployeeAddressPKBean;
import com.covalense.mapping.bean.manytoone.EmployeeEducationInfo;
import com.covalense.mapping.bean.manytoone.EmployeeEducationPkBean;
import com.covalense.mapping.bean.manytoone.EmployeeExperienceInfo;
import com.covalense.mapping.bean.manytoone.EmployeeExperiencePkBean;
import com.covalense.mapping.bean.onetoone.EmployeeOtherInfoBean;
import com.covalense.mapping.model.HibernateImpl;
import com.covalense.mapping.primarybean.EmployeeInfoBean;

public class App {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat smple = new SimpleDateFormat("yyyy-MM-dd");
		EmployeeInfoBean bean = new EmployeeInfoBean();

		bean.setId(2);
		bean.setName("joy");
		bean.setAccountNumber(123175666);
		bean.setAge(21);
		//bean.setDepartementId(1);
		bean.setDesignation("CEO");
		Date date = smple.parse("1998-01-14");
		bean.setDob(date);
		bean.setEmail("flaviyajyothi@gmail.com");
		bean.setGender("female");
		Date date1 = smple.parse("2019-06-03");
		bean.setJoiningDate(date1);
		/* empInf.setManagerId(empInf); */
		bean.setPhone(1234567890);
		bean.setSalary(13000);

		EmployeeInfoBean bean2 = new EmployeeInfoBean();
		SimpleDateFormat smple1 = new SimpleDateFormat("yyyy-MM-dd");
		bean2.setId(111);
		bean2.setName("Jyothi");
		bean2.setAccountNumber(123175666);
		bean2.setAge(21);
		//bean2.setDepartementId(1);
		bean2.setDesignation("developer");
		Date date2 = smple1.parse("1998-01-14");
		bean2.setDob(date2);
		bean2.setEmail("flaviyajyothi@gmail.com");
		bean2.setGender("female");
		Date date3 = smple1.parse("2019-06-03");
		bean2.setJoiningDate(date3);
		bean2.setManagerId(bean);
		bean2.setPhone(1234567890);
		bean2.setSalary(13000);

		EmployeeOtherInfoBean employeeOtherInfo = new EmployeeOtherInfoBean();

		employeeOtherInfo.setChallanged(false);
		employeeOtherInfo.setBloodGroup("B +ve");
		employeeOtherInfo.setEmergencyContactNumber(11423341);
		employeeOtherInfo.setAdhar(213243516);
		employeeOtherInfo.setEmegrencyContactPerson("Lavina");
		employeeOtherInfo.setFatherName("Luvis Pais");
		employeeOtherInfo.setMarried(false);
		employeeOtherInfo.setMotherName("Lavina Pais");
		employeeOtherInfo.setNationality("indian");
		employeeOtherInfo.setPan(123);
		employeeOtherInfo.setReligion("Christian");
		employeeOtherInfo.setSpouseName("ABC");
		bean.setEmployeeOtherInfo(employeeOtherInfo);

		EmployeeAddressPKBean addressPKBean1 = new EmployeeAddressPKBean();
		addressPKBean1.setAddressType("temporary");
		addressPKBean1.setEmployeeInfoBean(bean);

		EmployeeAddressPKBean addressPKBean2 = new EmployeeAddressPKBean();
		addressPKBean2.setAddressType("permanent");
		addressPKBean2.setEmployeeInfoBean(bean);

		EmployeeAddressInfoBean addressInfoBean1 = new EmployeeAddressInfoBean();
		addressInfoBean1.setAddressPKBean(addressPKBean1);
		addressInfoBean1.setAddress1("JyothiNagar");
		addressInfoBean1.setAddress2("Kavoor");
		addressInfoBean1.setLandmark("Behind SBI BANK");
		addressInfoBean1.setCity("MANGLORE");
		addressInfoBean1.setState("KARNATAKa");
		addressInfoBean1.setCountry("INDIA");
		addressInfoBean1.setPincode(573134);

		EmployeeAddressInfoBean addressInfoBean2 = new EmployeeAddressInfoBean();
		addressInfoBean2.setAddressPKBean(addressPKBean2);
		addressInfoBean2.setAddress1("Electronic City");
		addressInfoBean2.setAddress2("E-City Phase 2");
		addressInfoBean2.setLandmark("Near RajaRajeshwari Temple");
		addressInfoBean2.setCity("BANGLORE");
		addressInfoBean2.setState("KARNATAKA");
		addressInfoBean2.setCountry("INDIA");
		addressInfoBean2.setPincode(560100);
		//bean.setAddressInfoBean(Arrays.asList(addressInfoBean1,addressInfoBean2));
		
		
		  EmployeeEducationPkBean educationPkBean1=new EmployeeEducationPkBean();
		  educationPkBean1.setEducationType("FullTime");
		  educationPkBean1.setEmployeeInfoBean(bean);
		  
		  EmployeeEducationPkBean educationPkBean2=new EmployeeEducationPkBean();
		  educationPkBean2.setEducationType("Correspondnce");
		  educationPkBean2.setEmployeeInfoBean(bean);
		  
		  EmployeeEducationInfo educationInfo1=new EmployeeEducationInfo();
		  educationInfo1.setEducationPkBean(educationPkBean1);
		  educationInfo1.setCollageName("NTTF"); educationInfo1.setBarnch("Computer");
		  educationInfo1.setLocation("E-City"); 
		  educationInfo1.setUniversity("Banglore");
		  
		  
		  EmployeeEducationInfo educationInfo2=new EmployeeEducationInfo();
		  educationInfo2.setEducationPkBean(educationPkBean2);
		  educationInfo2.setCollageName("St.Anns Pu Girls Collage");
		  educationInfo2.setBarnch("PCMB"); 
		  educationInfo2.setLocation("MANGLORE");
		  educationInfo2.setUniversity("MANGLORE");
		  bean.setEducationInfo(Arrays.asList(educationInfo1,educationInfo2));
		  
		
		  EmployeeExperiencePkBean experiencePkBean1=new EmployeeExperiencePkBean();
		  experiencePkBean1.setCompanyName("TVS"); 
		  experiencePkBean1.setEmployeeInfoBean(bean);
		  
		  EmployeeExperiencePkBean experiencePkBean2=new EmployeeExperiencePkBean();
		  experiencePkBean2.setCompanyName("COVALENSE");
		  experiencePkBean2.setEmployeeInfoBean(bean);
		  
		  EmployeeExperienceInfo experienceInfo1=new EmployeeExperienceInfo();
		  experienceInfo1.setExperiencePkBean(experiencePkBean1);
		  experienceInfo1.setDesignation("Developer");
				  
		  EmployeeExperienceInfo experienceInfo2=new EmployeeExperienceInfo();
		  experienceInfo2.setExperiencePkBean(experiencePkBean2);
		  experienceInfo2.setDesignation("Developer");
		  bean.setExperienceInfoBean(Arrays.asList(experienceInfo1,experienceInfo2));
		  		
		  TrainingInfo trainingInfo = new TrainingInfo();
		  trainingInfo.setCourseName("java");
		  trainingInfo.setDuration("2 months");
		  trainingInfo.setCourseId(100);
		  trainingInfo.setEmployeeInfo(Arrays.asList(bean));		  
		  
		/*
		 * EmployeeInfoBean empinfo1 = hibernateImpl.getEmployeeInfoBean(5);
		 * EmployeeInfoBean empinfo2 = hibernateImpl.getEmployeeInfoBean(111);
		 */
		  
		/* trainingInfo.setEmployeeInfo(Arrays.asList(empinfo1,empinfo2)); */	  
		
		  bean.setTrainingInfoBean(Arrays.asList(trainingInfo));
		  
		  HibernateImpl hibernateImpl = new HibernateImpl();
		  hibernateImpl.createTraining(trainingInfo); 
		  
	}
}
