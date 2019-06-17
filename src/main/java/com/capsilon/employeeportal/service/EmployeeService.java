package com.capsilon.employeeportal.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capsilon.employeeportal.business.mapper.EmployeeMapper;
import com.capsilon.employeeportal.business.objects.Employee;
import com.capsilon.employeeportal.business.objects.EmployeeStatus;
import com.capsilon.employeeportal.document.DBEmployee;
import com.capsilon.employeeportal.exception.ApplicationException;
import com.capsilon.employeeportal.exception.ErrorResponseEnum;
import com.capsilon.employeeportal.repository.EmployeeRepository;
import com.capsilon.employeeportal.util.Utils;

@Service
public class EmployeeService
{
	EmployeeRepository employeeRepository;

	private final MongoOperations operations;

	EmployeeService(MongoOperations operations)
	{
		this.operations = operations;
	}

	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository)
	{
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> getAllEmployees()
	{
		List<Employee> employees = new ArrayList<>();
		List<DBEmployee> dbEmployees = employeeRepository.findAll();
		for (DBEmployee dbEmployee : dbEmployees)
		{
			employees.add(EmployeeMapper.convertEmployee(dbEmployee));
		}
		return employees;
	}

	public Employee getEmployeeById(Integer employeeId) throws Exception
	{
		DBEmployee dbEmployee = employeeRepository.findById(employeeId).get();
		if (null == dbEmployee)
		{
			throw new ApplicationException(ErrorResponseEnum.RESOURCE_NOT_FOUND, "Employee with id : " + Utils.getSingleQuotedString(employeeId) + "  not found");
		}
		return EmployeeMapper.convertEmployee(dbEmployee);
	}

	@Transactional(rollbackFor = Throwable.class)
	public List<Employee> createOrUpdateEmployees(List<Employee> employees) throws Exception
	{
		Date currentDate = new Date();
		List<Employee> persistedEmployees = new ArrayList<>();
		Map<Integer, DBEmployee> existingEmployeesMap = loadExistingEmployees(employees);
		for (Employee employee : employees)
		{
			boolean createEmployee = !existingEmployeesMap.containsKey(employee.getEmployeeId());
			validateEmployee(employee, createEmployee);
			employee.setUpdatedBy("Tanmay Patel"); //TODO: Replace by Google name
			employee.setUpdatedDateTime(currentDate);
			DBEmployee dbEmployee = null;
			if (createEmployee)
			{
				dbEmployee = createEmployee(employee, currentDate);
			}
			else
			{
				dbEmployee = updateEmployee(existingEmployeesMap, employee);
			}
			DBEmployee persistedDBEmployee = operations.save(dbEmployee);
			persistedEmployees.add(EmployeeMapper.convertEmployee(persistedDBEmployee));
		}
		return persistedEmployees;
	}

	private DBEmployee updateEmployee(Map<Integer, DBEmployee> existingEmployees, Employee employee)
	{
		DBEmployee dbEmployee;
		dbEmployee = EmployeeMapper.convertEmployee(employee, existingEmployees.get(employee.getEmployeeId()));
		return dbEmployee;
	}

	private DBEmployee createEmployee(Employee employee, Date currentDate)
	{
		DBEmployee dbEmployee;
		employee.setStatus(EmployeeStatus.ACTIVE.name());
		employee.setCreatedBy("Tanmay Patel"); //TODO: Replace by Google name
		employee.setCreatedDateTime(currentDate);
		dbEmployee = EmployeeMapper.convertEmployee(employee);
		return dbEmployee;
	}

	private void validateEmployee(Employee employee, boolean createEmployee) throws Exception
	{
		Utils.isIntegerValid("Employee Id", employee.getEmployeeId(), true);
		/*if (employeeRepository.exists(employee.getEmployeeId()))
		{
			throw new ApplicationException(ErrorResponseEnum.RESOURCE_ALREADY_EXISTS, "Employee with id : " + Utils.getSingleQuotedString(employee.getEmployeeId()) + " already exixts");
		}*/
		if (createEmployee)
		{
			Utils.isNotNullAndNotEmpty("Name", employee.getName(), true);
			Utils.isNotNullAndNotEmpty("Email Id", employee.getEmailId(), true);
		}
	}

	public Map<Integer, DBEmployee> loadExistingEmployees(List<Employee> employees)
	{
		List<Integer> employeeIds = employees.stream().map(Employee::getEmployeeId).collect(Collectors.toList());
		List<DBEmployee> dbEmployees = (List<DBEmployee>) employeeRepository.findAllById(employeeIds);
		Map<Integer, DBEmployee> employeeIdDBEmployeeMap = dbEmployees.stream().collect(Collectors.toMap(DBEmployee::getEmployeeId, Function.identity()));
		return employeeIdDBEmployeeMap;
	}
	/*private DBEmployee getSampleDBEmployeeForSearchByIds(Employee employee)
	{
		DBEmployee dbEmployee = new DBEmployee();
		dbEmployee.setEmployeeId(employee.getEmployeeId());
		return dbEmployee;
	}*/
}
