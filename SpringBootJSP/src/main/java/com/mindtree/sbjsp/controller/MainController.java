package com.mindtree.sbjsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindtree.sbjsp.model.Person;
import com.mindtree.sbjsp.service.Service;

@Controller
public class MainController {
	
	@Autowired
	private Service service;

//	private static List<Person> persons = new ArrayList<Person>();
//
//	static {
//		persons.add(new Person("Bill", "Gates"));
//		persons.add(new Person("Steve", "Jobs"));
//	}

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index(Model model) {
		String message = "Hello Spring Boot + JSP";
		model.addAttribute("message", message);
		return "index";
	}

	@RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
	public String viewPersonList(Model model) {
		List<Person> persons = service.getAllPersons();
		model.addAttribute("persons", persons);
		return "personList";
	}
}
