package com.example.springboot.service;

import java.util.List;

import com.example.springboot.model.Employees;

public interface EmployeeService {
	List<Employees> getAllEmployees();
	
	void saveEmployee(Employees employees);
}
