package org.uoa.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.uoa.dao.EmployeeDao;
import org.uoa.domain.Employee;
import org.uoa.domain.Manager;

public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {

	@Override
	public Employee get(int id) {
		return getHibernateTemplate().get(Employee.class, id);
	}

	@Override
	public int save(Employee employee) {
		return (Integer) getHibernateTemplate().save(employee);
	}

	@Override
	public void update(Employee employee) {
		getHibernateTemplate().update(employee);
	}

	@Override
	public void delete(Employee employee) {
		getHibernateTemplate().delete(employee);
	}

	@Override
	public void delete(int id) {
		getHibernateTemplate().delete(get(id));
	}

	@Override
	public List<Employee> findAll() {
		return (List<Employee>) getHibernateTemplate().find("from Employee");
	}

	@Override
	public List<Employee> findByNameAndPass(Employee employee) {
		return null;
	}

	@Override
	public List<Employee> findByName(String name) {
		return (List<Employee>) getHibernateTemplate().find("from Employee as e where e.name=?", name);
	}

	@Override
	public List<Employee> findByManager(Manager manager) {
		return (List<Employee>) getHibernateTemplate().find("from Employee as e where e.manager=?",manager);
	}

}
