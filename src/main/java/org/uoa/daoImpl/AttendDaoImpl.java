package org.uoa.daoImpl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.uoa.dao.AttendDao;
import org.uoa.domain.Attend;
import org.uoa.domain.AttendType;
import org.uoa.domain.Employee;

public class AttendDaoImpl extends HibernateDaoSupport implements AttendDao {

	@Override
	public Attend get(int id) {
		return getHibernateTemplate().get(Attend.class, id);
	}

	@Override
	public int save(Attend attend) {
		return (Integer) getHibernateTemplate().save(attend);
	}

	@Override
	public void update(Attend attend) {
		getHibernateTemplate().update(attend);
	}

	@Override
	public void delete(Attend attend) {
		getHibernateTemplate().delete(attend);
	}

	@Override
	public void delete(int id) {
		getHibernateTemplate().delete(get(id));
	}

	@Override
	public List<Attend> fintedAll() {
		return (List<Attend>)getHibernateTemplate().find("from Attend");
	}

	@Override
	public List<Attend> findByEmployee(Employee employee) {
		return (List<Attend>)getHibernateTemplate().find("from Attend as a where a.employee=?", employee);
	}

	@Override
	public List<Attend> findByEmployeeAndDutyDay(Employee employee,
			String dutyDay) {
		return (List<Attend>)getHibernateTemplate().find("from Attend as a where a.employee=? and a.dutyDay=?", new Object[]{employee, dutyDay});
	}

	@Override
	public Attend findByEmployeeAndDutyDayAndCome(Employee employee,
			String dutyDay, boolean isCome) {
		List<Attend> al=findByEmployeeAndDutyDay(employee, dutyDay);
		if(al!=null || al.size()>1){
			for(Attend attend:al){
				if(attend.getIsCome()==isCome){
					return attend;
				}
			}
		}
		return null;
	}

	@Override
	public List<Attend> findByEmployeeUnattend(Employee employee,
			AttendType attendType) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
		Calendar calendar=Calendar.getInstance();
		String end=sdf.format(calendar.getTime());
		calendar.add(Calendar.DAY_OF_MONTH, -3);
		String start=sdf.format(calendar.getTime());
		Object[ ] args={employee, attendType, start, end};
		return (List<Attend>)getHibernateTemplate().find("from Attend as a where a.employee=? and "
				+ "a.attendType=? and a.dutyDay between ? and ?", args);
	}

}
