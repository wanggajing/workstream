package org.uoa.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.uoa.dao.ApplicationDao;
import org.uoa.domain.Application;
import org.uoa.domain.Employee;

public class ApplicationDaoImpl extends HibernateDaoSupport implements
		ApplicationDao {

	@Override
	public Application get(int id) {
		return getHibernateTemplate().get(Application.class, id);
	}

	@Override
	public int save(Application application) {
		return (Integer) getHibernateTemplate().save(application);
	}

	@Override
	public void update(Application application) {
		getHibernateTemplate().update(application);
	}

	@Override
	public void delete(Application application) {
		getHibernateTemplate().delete(application);
	}

	@Override
	public void delete(int id) {
		getHibernateTemplate().delete(get(id));
	}

	@Override
	public List<Application> findAll() {
		return (List<Application>)getHibernateTemplate().find("from Application");
	}

	@Override
	public List<Application> findByEmployee(Employee employee) {
		return (List<Application>)getHibernateTemplate().find("from Application as a where a.attend.employ=?", employee);
	}

}
