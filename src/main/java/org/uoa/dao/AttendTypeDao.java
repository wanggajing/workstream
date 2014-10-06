package org.uoa.dao;

import java.util.List;

import org.uoa.domain.AttendType;

public interface AttendTypeDao {
	AttendType get(int id);
	int save(AttendType attendType);
	void update(AttendType attendType);
	void delete(AttendType attendType);
	void delete(int id);
	List<AttendType> findAll();
}
