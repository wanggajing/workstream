package org.uoa.dao;

import java.util.List;

import org.uoa.domain.CheckBack;

public interface CheckBackDao {
	CheckBack get(int id);
	int save(CheckBack checkBack);
	void update(CheckBack checkBack);
	void delete(CheckBack checkBack);
	void delete(int id);
	List<CheckBack> findAll();
}
