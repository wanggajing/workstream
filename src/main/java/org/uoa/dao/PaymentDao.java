package org.uoa.dao;

import java.util.List;

import org.uoa.domain.Employee;
import org.uoa.domain.Payment;

public interface PaymentDao {
	Payment get(int id);
	int save(Payment payment);
	void update(Payment payment);
	void delete(Payment payment);
	void delete(int id);
	List<Payment> findAll();
	List<Payment> findByEmployee(Employee employee);
	List<Payment> findByMonthAndEmployee(Employee employee, String payMonth);
}