package com.capsilon.employeeportal.document;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employee_designation_history")
public class DBEmployeeDesignationHistory extends DBEmployeeHistoryBase
{
	String designation;

	public String getDesignation()
	{
		return designation;
	}

	public void setDesignation(String designation)
	{
		this.designation = designation;
	}
}
