package org.uoa.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.uoa.dao.PaymentDao;
import org.uoa.domain.Employee;
import org.uoa.domain.Payment;

public class PaymentDaoImpl extends HibernateDaoSupport implements PaymentDao {

	@Override
	public Payment get(int id) {
		return getHibernateTemplate().get(Payment.class, id);
	}

	@Override
	public int save(Payment payment) {
		return (Integer) getHibernateTemplate().save(payment);
	}

	@Override
	public void update(Payment payment) {
		getHibernateTemplate().update(payment);
	}

	@Override
	public void delete(Payment payment) {
		getHibernateTemplate().delete(payment);
	}

	@Override
	public void delete(int id) {
		getHibernateTemplate().delete(get(id));
	}

	@Override
	public List<Payment> findAll() {
		return (List<Payment>) getHibernateTemplate().find("from Payment");
	}

	@Override
	public List<Payment> findByEmployee(Employee employee) {
		return (List<Payment>) getHibernateTemplate().find("from Payment as p where p.employee=?", employee);
	}

	@Override
	public List<Payment> findByMonthAndEmployee(Employee employee,
			String payMonth) {
		return (List<Payment>) getHibernateTemplate().find("from Payment as p where p.employee=? and p.time_paid=?", 
				new Object[]{employee,payMonth});
	}

}
