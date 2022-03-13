package com.example.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.repository.AdminRepository;

@Service
public class AdminServiceImpl {
	@Autowired
	private AdminRepository adminRepository;
//
//	public List<Admin> getAllAdmin(){
//		return adminRepository.findAll();
//	}

}
