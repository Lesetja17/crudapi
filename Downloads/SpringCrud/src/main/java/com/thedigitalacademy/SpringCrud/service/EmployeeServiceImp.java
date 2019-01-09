package com.thedigitalacademy.SpringCrud.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thedigitalacademy.SpringCrud.dao.EmployeeDao;
import com.thedigitalacademy.SpringCrud.model.Employee;
@Service
public class EmployeeServiceImp implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
    @Transactional
	@Override
	public List<Employee> get() {
    	return employeeDao.get();
		
	}
    @Transactional
	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
    @Transactional
	@Override
	public void save(Employee employee) {
	employeeDao.save(employee);
		
	}
    @Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
