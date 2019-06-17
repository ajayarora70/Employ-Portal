package com.capsilon.employeeportal.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capsilon.employeeportal.document.DBEmployee;
import com.capsilon.employeeportal.repository.EmployeeRepository;

@RestController
@RequestMapping("/rest/users")
public class EmployeeResource
{
	private EmployeeRepository employeeRepository;

	public EmployeeResource(EmployeeRepository userRepository)
	{
		this.employeeRepository = userRepository;
	}

	@GetMapping("/all")
	public List<DBEmployee> getAll()
	{
		return employeeRepository.findAll();
	}
}
