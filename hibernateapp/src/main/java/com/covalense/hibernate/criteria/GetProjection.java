package com.covalense.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.covalense.hibernateapp.dto.EmployeeInfo;
import com.covalense.hubernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetProjection {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.buildSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfo.class);
		Projection pro = Projections.property("NAME");
		Projection pro1 = Projections.property("id");
		Projection pro2 = Projections.property("EMAIL");
		ProjectionList projectionList = Projections.projectionList();

		projectionList.add(pro);
		projectionList.add(pro1);
		projectionList.add(pro2);
		criteria.setProjection(projectionList);
		List<Object[]> str = criteria.list();
		for (Object[] objects : str) {
			log.info("NAME IS :" + objects[0]);
			log.info("ID IS :" + objects[1]);
			log.info("ID IS :" + objects[2]);
		}
	}
}
