package com.mindtree.taskmanagement.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mindtree.taskmanagement.entity.Employee;
import com.mindtree.taskmanagement.entity.Project;
import com.mindtree.taskmanagement.entity.Task;

@Repository
public interface TaskManagementAppDao {

	public List<Employee> getAllEmployees();

	public List<Task> getAllTasks();
	
	public List<Project> getAllProjects();
	
	public String addProject(Project project);
	
	public void addProjectToDB(Project project);
	
	public void addTaskToDB(Task task);
	
	public void addEmployeeToDB(Employee employee);

}
