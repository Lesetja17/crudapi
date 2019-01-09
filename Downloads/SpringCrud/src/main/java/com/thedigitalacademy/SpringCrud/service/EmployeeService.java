package com.thedigitalacademy.SpringCrud.service;

import java.util.List;

import com.thedigitalacademy.SpringCrud.model.Employee;

public interface EmployeeService {
List<Employee>get();
	
	Employee get(int id);
	
	void save(Employee employee);
	void delete(int id);

}
