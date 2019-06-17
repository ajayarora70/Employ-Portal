package com.capsilon.employeeportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capsilon.employeeportal.business.objects.Employee;
import com.capsilon.employeeportal.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController
{
	@Autowired
	EmployeeService employeeService;

	/*@RequestMapping(method = RequestMethod.GET)
	public List<Employee> listAllEmployees()
	{
		return employeeService.getAllEmployees();
	}*/
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> listAllEmployees()
	{
		return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{employeeId}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable int employeeId) throws Exception
	{
		return new ResponseEntity<>(employeeService.getEmployeeById(employeeId), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<List<Employee>> createEmployee(@RequestBody List<Employee> employees) throws Exception
	{
		return new ResponseEntity<>(employeeService.createOrUpdateEmployees(employees), HttpStatus.OK);
	}
}
