package com.mindtree.taskmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TaskManagementAppController {

	@RequestMapping("/")
	public String homePage() {
		return "home";
	}
	
	@RequestMapping("/project")
	public String project() {
		return "project";
	}
	
	@RequestMapping("/resource")
	public String resource() {
		return "resource";
	}
}
