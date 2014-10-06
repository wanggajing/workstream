package org.uoa.domain;

import java.util.HashSet;
import java.util.Set;

public class Manager extends Employee{
	private String dept; // department which this manager running
	private Set<Employee> employees=new HashSet<Employee>(); // one manager manages many employees
	private Set<CheckBack> checkbacks=new HashSet<CheckBack>(); // one manager writes many checkbacks
	
	public Manager(){}

	public Manager(String dept, Set<Employee> employees,
			Set<CheckBack> checkbacks) {
		super();
		this.dept = dept;
		this.employees = employees;
		this.checkbacks = checkbacks;
	}
	//setter and getter

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public Set<CheckBack> getCheckbacks() {
		return checkbacks;
	}

	public void setCheckbacks(Set<CheckBack> checkbacks) {
		this.checkbacks = checkbacks;
	}
	
	
}
