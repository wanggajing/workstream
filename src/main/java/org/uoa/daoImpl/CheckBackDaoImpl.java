package org.uoa.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.uoa.dao.CheckBackDao;
import org.uoa.domain.CheckBack;

public class CheckBackDaoImpl extends HibernateDaoSupport implements
		CheckBackDao {

	@Override
	public CheckBack get(int id) {
		return getHibernateTemplate().get(CheckBack.class, id);
	}

	@Override
	public int save(CheckBack checkBack) {
		return (Integer) getHibernateTemplate().save(checkBack);
	}

	@Override
	public void update(CheckBack checkBack) {
		getHibernateTemplate().update(checkBack);
	}

	@Override
	public void delete(CheckBack checkBack) {
		getHibernateTemplate().delete(checkBack);
	}

	@Override
	public void delete(int id) {
		getHibernateTemplate().delete(get(id));
	}

	@Override
	public List<CheckBack> findAll() {
		return (List<CheckBack>) getHibernateTemplate().find("from CheckBack");
	}

}
