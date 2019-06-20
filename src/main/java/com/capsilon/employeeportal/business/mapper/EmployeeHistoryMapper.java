package com.capsilon.employeeportal.business.mapper;

import java.util.function.Consumer;

import com.capsilon.employeeportal.business.objects.Employee;
import com.capsilon.employeeportal.business.objects.EmployeeHistory;
import com.capsilon.employeeportal.document.DBEmployee;
import com.capsilon.employeeportal.document.DBEmployeeHistory;
import com.capsilon.employeeportal.document.DBEmployeeSalaryHistory;

public class EmployeeHistoryMapper
{
	/*public static DBEmployeeHistory convertEmployeeHistory(EmployeeHistory employeeHistory)
	{
		DBEmployeeHistory dbEmployeeHistory = new DBEmployeeHistory();
		dbEmployeeHistory.setEmployeeId(employeeHistory.getEmployeeId());
		return dbEmployee;
	}*/

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
		
		
		employee.setHighestDegree(dbEmployee.getHighestDegree());
		employee.setSpecialization(dbEmployee.getSpecialization());
		employee.setYearOfCompletion(dbEmployee.getYearOfCompletion());
		employee.setMonthOfExprience(dbEmployee.getMonthOfExprience());
		
		employee.setHaveValidPassport(dbEmployee.isHavepassport());
		employee.setPassportNumber(dbEmployee.getPassportNumber());
		employee.setDateOfExpiry(dbEmployee.getDateOfExpiry());
		employee.setHaveValidVisa(dbEmployee.getHaveValidVisa());
		employee.setVisaNumber(dbEmployee.getVisaNumber());
		employee.setDateOfExpiryOfVisa(dbEmployee.getDateOfExpiryOfVisa());
		
		employee.setDepartment(dbEmployee.getDepartment());
		
		employee.setNameOfPrimaryContact(dbEmployee.getNameOfPrimaryContact());
		employee.setRelationshipWithPrimaryContact(dbEmployee.getRelationshipWithPrimaryContact());
		employee.setAddressOfPrimaryContact(dbEmployee.getAddressOfPrimaryContact());
		employee.setContactNumberOfPrimaryContact(dbEmployee.getContactNumberOfPrimaryContact());
		employee.setNameOfSecondaryContact(dbEmployee.getNameOfSecondaryContact());
		employee.setRelationshipWithSecondaryContact(dbEmployee.getRelationshipWithSecondaryContact());
		employee.setAddressOfSecondaryContact(dbEmployee.getAddressOfSecondaryContact());
		employee.setContactNumberOfSecondaryContact(dbEmployee.getContactNumberOfSecondaryContact());
		
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
