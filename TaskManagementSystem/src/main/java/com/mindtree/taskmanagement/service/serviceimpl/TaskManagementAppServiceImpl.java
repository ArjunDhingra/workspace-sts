package com.mindtree.taskmanagement.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.taskmanagement.dao.TaskManagementAppDao;
import com.mindtree.taskmanagement.entity.Employee;
import com.mindtree.taskmanagement.entity.Project;
import com.mindtree.taskmanagement.entity.Task;
import com.mindtree.taskmanagement.service.TaskManagementAppService;

@Service
public class TaskManagementAppServiceImpl implements TaskManagementAppService {

	@Autowired
	private TaskManagementAppDao appDao;

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = appDao.getAllEmployees();
		return employees;
	}

	@Override
	public List<Task> getAllTasks() {
		List<Task> tasks = appDao.getAllTasks();
		return tasks;
	}

	@Override
	public Project getProjectByName(String projectName) {
		System.out.println("Hi");
		List<Project> projects = appDao.getAllProjects();
		System.out.println("Hello");
		Project projectss = new Project();
		for (Project project : projects) {
			if (project.getTitle().equalsIgnoreCase(projectName)) {
				projectss = project;
			}
		}
		return projectss;
	}

	@Override
	public List<Project> getAllProjects() {
		return appDao.getAllProjects();
	}

	@Override
	public List<String> getProject() {
		List<String> projects = new ArrayList<>();
		List<Project> projectss = appDao.getAllProjects();
		for (Project project : projectss) {
			projects.add(project.getTitle());
		}
		return projects;
	}

	@Override
	public String addProject(Project project) {
		return appDao.addProject(project);
	}

	@Override
	public void addProjectToDB(Project project) {
		appDao.addProjectToDB(project);		
	}

	@Override
	public void addTaskToDB(Task task) {
		appDao.addTaskToDB(task);
	}

	@Override
	public void addEmployeeToDB(Employee employee) {
		appDao.addEmployeeToDB(employee);
	}

}
