package org.uoa.dao;

import java.util.List;

import org.uoa.domain.Attend;
import org.uoa.domain.AttendType;
import org.uoa.domain.Employee;

public interface AttendDao {
	Attend get(int id);
	int save(Attend attend);
	void update(Attend attend);
	void delete(Attend attend);
	void delete(int id);
	List<Attend> fintedAll();
	List<Attend> findByEmployee(Employee employee);
	List<Attend> findByEmployeeAndDutyDay(Employee employee,String dutyDay);
	Attend findByEmployeeAndDutyDayAndCome(Employee employee,String dutyDay,boolean isCome);
	List<Attend> findByEmployeeUnattend(Employee employee,AttendType attendType);
}
