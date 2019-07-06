package com.covalense.designpattern;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.covalense.designpattern.beans.EmployeeInfo;
import com.covalense.designpattern.dao.EmployeeDAO;
import com.covalense.designpattern.dao.EmployeeDAOFactory;
import lombok.extern.java.Log;

@Log
public class DesignPatternTest {

	public static void main(String[] args) throws ParseException {

		EmployeeDAO dao = EmployeeDAOFactory.getinstance();
		// printInfo(dao.getEmployeeInfo("3"));
		printInfo(dao.getEmployeeInfo(1));

		/*
		 * ArrayList<EmployeeInfo> beans = dao.getAllEmployeeInfo(); for (EmployeeInfo
		 * bean : beans) {
		 * 
		 * printInfo(bean); }
		 */
		// create an object
		SimpleDateFormat smple = new SimpleDateFormat("yyyy-MM-dd");
		EmployeeInfo empInf = new EmployeeInfo();

		empInf.setID(34);
		empInf.setNAME("teena");
		empInf.setACCOUNT_NUMBER(123145666);
		empInf.setAGE(19);
		empInf.setDEPT_ID(2);
		empInf.setDESIGNATION("networking");
		Date date = smple.parse("2000-07-16");
		empInf.setDOB(date);
		empInf.setEMAIL("tinu@gmail.com");
		empInf.setGENDER("female");
		Date date1 = smple.parse("2019-03-13");
		empInf.setJOINING_DATE(date1);
		empInf.setMNGR_ID(74);
		empInf.setPHONE(1432689456);
		empInf.setSALARY(13000);

		log.info("Inserted the Employee Info ? Ans :" + dao.createEmployeeInfo(empInf));
		dao.deleteEmployeeInfo(21);
	}

	private static void printInfo(EmployeeInfo bean) {
		log.info("" + bean.getNAME());
		log.info("AGE IS :" + bean.getAGE());
		log.info("DATE OF BIRTH IS :" + bean.getDOB());
		log.info("GENDER IS :" + bean.getGENDER());
		log.info("MAIL ID IS :" + bean.getEMAIL());
		log.info("MANAGER ID IS :" + bean.getMNGR_ID());
		log.info("DESIGNATION IS :" + bean.getDESIGNATION());
	}
}
