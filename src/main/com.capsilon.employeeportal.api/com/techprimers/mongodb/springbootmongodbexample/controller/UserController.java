package com.techprimers.mongodb.springbootmongodbexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.mongodb.springbootmongodbexample.document.Users;
import com.techprimers.mongodb.springbootmongodbexample.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	UserRepository productRepository;

	@RequestMapping(method = RequestMethod.GET, value = "/products")
	public Iterable<Users> product() {
		return productRepository.findAll();
	}
}
