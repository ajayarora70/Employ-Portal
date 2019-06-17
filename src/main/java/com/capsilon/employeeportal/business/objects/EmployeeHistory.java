package com.capsilon.employeeportal.business.objects;

import java.util.List;

public class EmployeeHistory extends Record
{
	Integer employeeId;

	List<EmployeeDesignationHistory> dbEmployeeDesignationHistories;

	List<EmployeeSalaryHistory> dbEmployeeSalaryHistories;

	public Integer getEmployeeId()
	{
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId)
	{
		this.employeeId = employeeId;
	}

	public List<EmployeeDesignationHistory> getDbEmployeeDesignationHistories()
	{
		return dbEmployeeDesignationHistories;
	}

	public void setDbEmployeeDesignationHistories(List<EmployeeDesignationHistory> dbEmployeeDesignationHistories)
	{
		this.dbEmployeeDesignationHistories = dbEmployeeDesignationHistories;
	}

	public List<EmployeeSalaryHistory> getDbEmployeeSalaryHistories()
	{
		return dbEmployeeSalaryHistories;
	}

	public void setDbEmployeeSalaryHistories(List<EmployeeSalaryHistory> dbEmployeeSalaryHistories)
	{
		this.dbEmployeeSalaryHistories = dbEmployeeSalaryHistories;
	}
}
