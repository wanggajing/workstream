package org.uoa.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.uoa.dao.AttendTypeDao;
import org.uoa.domain.AttendType;

public class AttendTypeDaoImpl extends HibernateDaoSupport implements
		AttendTypeDao {

	@Override
	public AttendType get(int id) {
		return getHibernateTemplate().get(AttendType.class, id);
	}

	@Override
	public int save(AttendType attendType) {
		return (Integer) getHibernateTemplate().save(attendType);
	}

	@Override
	public void update(AttendType attendType) {
		getHibernateTemplate().update(attendType);
	}

	@Override
	public void delete(AttendType attendType) {
		getHibernateTemplate().delete(attendType);
	}

	@Override
	public void delete(int id) {
		getHibernateTemplate().delete(get(id));
	}

	@Override
	public List<AttendType> findAll() {
		return (List<AttendType>) getHibernateTemplate().find("from AttendType");
	}

}
