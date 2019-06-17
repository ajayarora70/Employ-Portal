package com.capsilon.employeeportal.business.objects;

import java.util.Date;

public class Employee extends Record
{
	private Integer employeeId;

	private String name;

	private String emailId;

	private Date dateOfBirth;

	private Date dateOfJoining;

	private Date dateOfResignation;

	private String designation;

	private Integer salary;

	private Integer reportingManagerId;

	private Integer reportingManagerName;

	private String capsilonPortalRole;

	private String status;

	public Integer getEmployeeId()
	{
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId)
	{
		this.employeeId = employeeId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getEmailId()
	{
		return emailId;
	}

	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}

	public Date getDateOfBirth()
	{
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfJoining()
	{
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining)
	{
		this.dateOfJoining = dateOfJoining;
	}

	public Date getDateOfResignation()
	{
		return dateOfResignation;
	}

	public void setDateOfResignation(Date dateOfResignation)
	{
		this.dateOfResignation = dateOfResignation;
	}

	public String getDesignation()
	{
		return designation;
	}

	public void setDesignation(String designation)
	{
		this.designation = designation;
	}

	public Integer getSalary()
	{
		return salary;
	}

	public void setSalary(Integer salary)
	{
		this.salary = salary;
	}

	public Integer getReportingManagerId()
	{
		return reportingManagerId;
	}

	public void setReportingManagerId(Integer reportingManagerId)
	{
		this.reportingManagerId = reportingManagerId;
	}

	public Integer getReportingManagerName()
	{
		return reportingManagerName;
	}

	public void setReportingManagerName(Integer reportingManagerName)
	{
		this.reportingManagerName = reportingManagerName;
	}

	public String getCapsilonPortalRole()
	{
		return capsilonPortalRole;
	}

	public void setCapsilonPortalRole(String capsilonPortalRole)
	{
		this.capsilonPortalRole = capsilonPortalRole;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}
}
