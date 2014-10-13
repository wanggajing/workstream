package org.uoa.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.uoa.dao.ManagerDao;
import org.uoa.domain.Manager;

public class ManagerDaoImpl extends HibernateDaoSupport implements ManagerDao {

	@Override
	public Manager get(int id) {
		return getHibernateTemplate().get(Manager.class, id);
	}

	@Override
	public int save(Manager manager) {
		return (Integer) getHibernateTemplate().save(manager);
	}

	@Override
	public void update(Manager manager) {
		getHibernateTemplate().update(manager);
	}

	@Override
	public void delete(Manager manager) {
		getHibernateTemplate().delete(manager);
	}

	@Override
	public void delete(int id) {
		getHibernateTemplate().delete(get(id));
	}

	@Override
	public List<Manager> findAll() {
		return (List<Manager>) getHibernateTemplate().find("from Manager");
	}

	@Override
	public List<Manager> findByNameAndPass(Manager manager) {
		return (List<Manager>) getHibernateTemplate().find("from Manager as m where m.name=? and m.password=?",new Object[]{manager.getName(), manager.getPassword()});
	}

	@Override
	public List<Manager> findByName(String name) {
		return (List<Manager>) getHibernateTemplate().find("from Manager as m where m.name=?",name);
	}

}
