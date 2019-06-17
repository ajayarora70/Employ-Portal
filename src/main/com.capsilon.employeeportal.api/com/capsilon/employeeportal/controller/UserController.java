package com.capsilon.employeeportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capsilon.employeeportal.document.DBEmployee;
import com.capsilon.employeeportal.repository.UserRepository;

@RestController
@RequestMapping("/employee")
public class UserController {

	@Autowired
	UserRepository productRepository;

	@RequestMapping(method = RequestMethod.GET)
	public Iterable<DBEmployee> listAllEmployees() {
		return productRepository.findAll();
	}
	

	
}
