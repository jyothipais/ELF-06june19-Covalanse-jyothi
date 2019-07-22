package com.covalense.hibernateapp.curdoperations;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.hibernateapp.bean.Student_info;
import com.covalense.hibernateapp.util.HibernateUtil;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Object;

import lombok.extern.java.Log;
@Log
public class StoredProcedureStu {
	public static void main(String[] args) {
		SessionFactory factory=HibernateUtil.buiSessionFactory();
		Session session=factory.openSession();
		
		StoredProcedureQuery query=session.createStoredProcedureCall(Student_info.class);
			List<Object[]> obj=query.getResultList();
			for(Object[] obj1:obj) {
				log.info(""+obj1);
				
			}
			
	}

}
