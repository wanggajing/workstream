package org.uoa.dao;

import java.util.List;

import org.uoa.domain.Manager;

public interface ManagerDao {
	Manager get(int id);
	int save(Manager manager);
	void update(Manager manager);
	void delete(Manager manager);
	void delete(int id);
	List<Manager> findAll();
	List<Manager> findByNameAndPass(Manager manager);
	List<Manager> findByName(String name);
}
