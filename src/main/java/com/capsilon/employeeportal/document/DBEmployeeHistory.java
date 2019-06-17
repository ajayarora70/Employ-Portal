package com.capsilon.employeeportal.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "employee_history")
public class DBEmployeeHistory extends DBRecord
{
	@Id
	Integer employeeId;

	@Field("employee_designation_history")
	List<DBEmployeeDesignationHistory> dbEmployeeDesignationHistories;

	@Field("employee_salary_history")
	List<DBEmployeeSalaryHistory> dbEmployeeSalaryHistories;

	public DBEmployeeHistory()
	{
	}

	public DBEmployeeHistory(Integer employeeId)
	{
		this.employeeId = employeeId;
	}

	public DBEmployeeHistory(Integer employeeId, List<DBEmployeeDesignationHistory> dbEmployeeDesignationHistories, List<DBEmployeeSalaryHistory> dbEmployeeSalaryHistories)
	{
		this.employeeId = employeeId;
		this.dbEmployeeDesignationHistories = dbEmployeeDesignationHistories;
		this.dbEmployeeSalaryHistories = dbEmployeeSalaryHistories;
	}

	public Integer getEmployeeId()
	{
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId)
	{
		this.employeeId = employeeId;
	}

	public List<DBEmployeeDesignationHistory> getDbEmployeeDesignationHistories()
	{
		return dbEmployeeDesignationHistories;
	}

	public void setDbEmployeeDesignationHistories(List<DBEmployeeDesignationHistory> dbEmployeeDesignationHistories)
	{
		this.dbEmployeeDesignationHistories = dbEmployeeDesignationHistories;
	}

	public List<DBEmployeeSalaryHistory> getDbEmployeeSalaryHistories()
	{
		return dbEmployeeSalaryHistories;
	}

	public void setDbEmployeeSalaryHistories(List<DBEmployeeSalaryHistory> dbEmployeeSalaryHistories)
	{
		this.dbEmployeeSalaryHistories = dbEmployeeSalaryHistories;
	}
}
