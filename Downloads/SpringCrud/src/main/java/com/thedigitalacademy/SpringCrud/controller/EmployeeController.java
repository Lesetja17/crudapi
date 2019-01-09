package com.thedigitalacademy.SpringCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thedigitalacademy.SpringCrud.model.Employee;
import com.thedigitalacademy.SpringCrud.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee")
	public List<Employee >get()
	{
		return employeeService.get();
	}
	@PostMapping("/employee")
	public Employee save(@RequestBody Employee employeeObj) {
		employeeService.save(employeeObj);
		return employeeObj;
	}

}
