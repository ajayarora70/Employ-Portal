package com.capsilon.employeeportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capsilon.employeeportal.document.DBEmployee;
import com.capsilon.employeeportal.document.DBEmployeeHistory;
import com.capsilon.employeeportal.repository.EmployeeHistoryRepository;
import com.capsilon.employeeportal.repository.EmployeeRepository;

@RestController
@RequestMapping("/dbemployee")
public class EmployeeDBController
{
	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	EmployeeHistoryRepository employeeHistoryRepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<DBEmployee> listAllDBEmployees()
	{
		return employeeRepository.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/history")
	public List<DBEmployeeHistory> listHistory()
	{
		return employeeHistoryRepository.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void createEmployee(@RequestBody List<DBEmployee> employees)
	{
		employeeRepository.saveAll(employees);
	}
}
