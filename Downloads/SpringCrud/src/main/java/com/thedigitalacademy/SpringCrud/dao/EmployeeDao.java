package com.thedigitalacademy.SpringCrud.dao;

import java.util.List;

import com.thedigitalacademy.SpringCrud.model.Employee;

public interface EmployeeDao {
	
	
	List<Employee>get();
	
	Employee get(int id);
	
	void save(Employee employee);
	void delete(int id);

}
