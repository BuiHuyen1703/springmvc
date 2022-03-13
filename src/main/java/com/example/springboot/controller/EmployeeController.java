//package com.example.springboot.controller;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.example.springboot.model.Employees;
//import com.example.springboot.service.EmployeeService;
//
//@Controller
//@RequestMapping(value = "/admin")
//public class EmployeeController {
//
//	@Autowired EmployeeService employeeService;
//
//	@GetMapping("/")
//	public String viewHomePage(Model model) {
//		model.addAttribute("listEmployees",employeeService.getAllEmployees() );
//		return "index";
//	}
//	
//	@GetMapping("/showNewEmployeeForm")
//	public String showNewEmployeeForm(Model model) {
//		Employees employees= new Employees();
//		model.addAttribute("emp", employees);
//		return "new_employee";
//	}
//	
//	@PostMapping("/saveEmployee")
//	public String saveEmployee(@ModelAttribute("employee") Employees employees) {
//		employeeService.saveEmployee(employees);
//		return "redirect:/admin";
//	}
//
//}
