package org.uoa.dao;

import java.util.List;

import org.uoa.domain.Employee;
import org.uoa.domain.Manager;

public interface EmployeeDao {
	Employee get(int id);
	int save(Employee employee);
	void update(Employee employee);
	void delete(Employee employee);
	void delete(int id);
	List<Employee> findAll();
	List<Employee> findByNameAndPass(Employee employee);
	List<Employee> findByName(String name);
	List<Employee> findByManager(Manager manager);
}
