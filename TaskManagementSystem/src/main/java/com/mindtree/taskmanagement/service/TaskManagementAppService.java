package com.mindtree.taskmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.taskmanagement.entity.Employee;
import com.mindtree.taskmanagement.entity.Project;
import com.mindtree.taskmanagement.entity.Task;

@Service
public interface TaskManagementAppService {
	
	public List<Employee> getAllEmployees();
	
	public List<Task> getAllTasks();
	
	public Project getProjectByName(String projectName);
	
	public List<Project> getAllProjects();
	
	public List<String> getProject();
	
	public String addProject(Project project);
	
	public void addProjectToDB(Project project);
	
	public void addTaskToDB(Task task);
	
	public void addEmployeeToDB(Employee employee);

}
