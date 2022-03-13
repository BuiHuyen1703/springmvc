package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
//	@Autowired AdminService adminService;
	@GetMapping("/admin")
	public String viewHomePage(Model model) {
//		model.addAttribute("listAdmin",adminService.getAdmin());
		return "home";
	}

}
