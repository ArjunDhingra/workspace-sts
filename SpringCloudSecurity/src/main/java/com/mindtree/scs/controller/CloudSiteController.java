package com.mindtree.scs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestOperations;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.scs.entity.Person;

@RestController
public class CloudSiteController {

	@Autowired
	private RestOperations restOperations;

	@GetMapping("/")
	@ResponseBody
	public String hello() {
		return "Hello Mindtree Mind";
	}

	@GetMapping("/person")
	@PreAuthorize("hasAnyRole('ADMIN', 'USER')")
	public @ResponseBody Person personInfo() {
		return new Person("abir", "Dhaka", "Bangladesh", 29, "Male");
	}

	@GetMapping("/personInfo")
	public ModelAndView person() {
		ModelAndView modelAndView = new ModelAndView("personinfo");
		String personResourceUrl = "http://localhost:9000/person";
		modelAndView.addObject("person", restOperations.getForObject(personResourceUrl, String.class));
		return modelAndView;
	}
}
