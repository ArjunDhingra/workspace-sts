package com.mindtree.sbjsp.dao.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.mindtree.sbjsp.dao.Dao;
import com.mindtree.sbjsp.model.Person;
import com.mindtree.sbjsp.util.HibernateUtil;

@Repository
public class DaoImpl implements Dao {

	@Override
	public List<Person> getAllPersons() {
		Session session = HibernateUtil.openSession();
		@SuppressWarnings("unchecked")
		List<Person> persons = session.createQuery("from Person").list();
		return persons;
	}

}
