package com.capsilon.employeeportal.business.mapper;

import java.util.function.Consumer;

import com.capsilon.employeeportal.business.objects.Employee;
import com.capsilon.employeeportal.document.DBEmployee;

public class EmployeeMapper
{
	public static DBEmployee convertEmployee(Employee employee)
	{
		DBEmployee dbEmployee = new DBEmployee();
		return convertEmployee(employee, dbEmployee);
	}

	public static DBEmployee convertEmployee(Employee employee, DBEmployee dbEmployee)
	{
		updateValue(dbEmployee::setEmployeeId, employee.getEmployeeId());
		updateValue(dbEmployee::setEmployeeId, employee.getEmployeeId());
		updateValue(dbEmployee::setName, employee.getName());
		updateValue(dbEmployee::setDateOfBirth, employee.getDateOfBirth());
		updateValue(dbEmployee::setDateOfJoining, employee.getDateOfJoining());
		updateValue(dbEmployee::setDateOfResignation, employee.getDateOfResignation());
		updateValue(dbEmployee::setDesignation, employee.getDesignation());
		updateValue(dbEmployee::setSalary, employee.getSalary());
		//dbEmployee.setSalary(employee.getSalary());
		updateValue(dbEmployee::setReportingManagerId, employee.getReportingManagerId());
		updateValue(dbEmployee::setReportingManagerName, employee.getReportingManagerName());
		updateValue(dbEmployee::setCapsilonPortalRole, employee.getCapsilonPortalRole());
		updateValue(dbEmployee::setStatus, employee.getStatus());
		updateValue(dbEmployee::setCreatedBy, employee.getCreatedBy());
		updateValue(dbEmployee::setCreatedDateTime, employee.getCreatedDateTime());
		updateValue(dbEmployee::setUpdatedBy, employee.getUpdatedBy());
		updateValue(dbEmployee::setUpdatedDateTime, employee.getUpdatedDateTime());
		return dbEmployee;
	}

	public static Employee convertEmployee(DBEmployee dbEmployee)
	{
		Employee employee = new Employee();
		employee.setEmployeeId(dbEmployee.getEmployeeId());
		employee.setName(dbEmployee.getName());
		employee.setDateOfBirth(dbEmployee.getDateOfBirth());
		employee.setDateOfJoining(dbEmployee.getDateOfJoining());
		employee.setDateOfResignation(dbEmployee.getDateOfResignation());
		employee.setDesignation(dbEmployee.getDesignation());
		employee.setSalary(dbEmployee.getSalary());
		employee.setReportingManagerId(dbEmployee.getReportingManagerId());
		employee.setReportingManagerName(dbEmployee.getReportingManagerName());
		employee.setCapsilonPortalRole(dbEmployee.getCapsilonPortalRole());
		employee.setStatus(dbEmployee.getStatus());
		employee.setCreatedBy(dbEmployee.getCreatedBy());
		employee.setCreatedDateTime(dbEmployee.getCreatedDateTime());
		employee.setUpdatedBy(dbEmployee.getUpdatedBy());
		employee.setUpdatedDateTime(dbEmployee.getUpdatedDateTime());
		return employee;
	}

	@SuppressWarnings("unchecked")
	private static <T> void updateValue(Consumer<T> setterMethod, Object value)
	{
		if (null != value)
		{
			setterMethod.accept((T) value);
		}
	}
}
