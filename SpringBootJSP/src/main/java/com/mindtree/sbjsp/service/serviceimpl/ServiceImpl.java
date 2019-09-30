package com.mindtree.sbjsp.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mindtree.sbjsp.dao.Dao;
import com.mindtree.sbjsp.model.Person;
import com.mindtree.sbjsp.service.Service;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

	@Autowired
	private Dao dao;
	
	@Override
	public List<Person> getAllPersons() {
		return dao.getAllPersons();
	}

}
