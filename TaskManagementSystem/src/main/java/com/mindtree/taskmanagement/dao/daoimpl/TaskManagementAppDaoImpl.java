package com.mindtree.taskmanagement.dao.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.mindtree.taskmanagement.dao.TaskManagementAppDao;
import com.mindtree.taskmanagement.entity.Employee;
import com.mindtree.taskmanagement.entity.Project;
import com.mindtree.taskmanagement.entity.Task;
import com.mindtree.taskmanagement.util.HibernateUtil;

@Repository
public class TaskManagementAppDaoImpl implements TaskManagementAppDao {

	@Override
	public List<Employee> getAllEmployees() {
		Session session = HibernateUtil.openSession();
		@SuppressWarnings("unchecked")
		List<Employee> employees = session.createQuery("from Employee").list();
		return employees;
	}

	@Override
	public List<Task> getAllTasks() {
		Session session = HibernateUtil.openSession();
		@SuppressWarnings("unchecked")
		List<Task> tasks = session.createQuery("from Task").list();
		return tasks;
	}

	@Override
	public List<Project> getAllProjects() {
		Session session = HibernateUtil.openSession();
		@SuppressWarnings("unchecked")
		List<Project> projects = session.createQuery("from Project").list();
		session.close();
		return projects;
	}

	@Override
	public String addProject(Project project) {
		Session session = HibernateUtil.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(project);
		transaction.commit();
		session.close();
		return "Added";
	}
	
	

	@Override
	public void addProjectToDB(Project project) {
		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();
		session.save(project);
		tx.commit();
		session.close();
	}

	@Override
	public void addTaskToDB(Task task) {
		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();
		session.save(task);
		tx.commit();
		session.close();
	}

	@Override
	public void addEmployeeToDB(Employee employee) {
		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();
		session.save(employee);
		tx.commit();
		session.close();
	}

}
