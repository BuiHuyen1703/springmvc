package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.model.Employees;

public interface EmployeeRepository extends JpaRepository<Employees, Long> {


}
