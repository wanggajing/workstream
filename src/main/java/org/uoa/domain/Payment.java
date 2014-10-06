package org.uoa.domain;

import java.util.Date;

public class Payment {
	private int id;
	private double amout_paid;
	private Date time_paid;
	private Employee employee; // one payment corresponds to one employee
	
	public Payment(){}

	public Payment(int id, double amout_paid, Date time_paid, Employee employee) {
		super();
		this.id = id;
		this.amout_paid = amout_paid;
		this.time_paid = time_paid;
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmout_paid() {
		return amout_paid;
	}

	public void setAmout_paid(double amout_paid) {
		this.amout_paid = amout_paid;
	}

	public Date getTime_paid() {
		return time_paid;
	}

	public void setTime_paid(Date time_paid) {
		this.time_paid = time_paid;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
