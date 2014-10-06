package org.uoa.dao;

import java.util.List;

import org.uoa.domain.Application;
import org.uoa.domain.Employee;

public interface ApplicationDao {
	Application get(int id);
	int save(Application application);
	void update(Application application);
	void delete(Application application);
	void delete(int id);
	List<Application> findAll();
	List<Application> findByEmployee(Employee employee);
}
