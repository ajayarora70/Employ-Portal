package com.capsilon.employeeportal.business.objects;

import java.util.Date;

public class Record
{
	Date createdDateTime;

	String createdBy;

	Date updatedDateTime;

	String updatedBy;

	public Date getCreatedDateTime()
	{
		return createdDateTime;
	}

	public void setCreatedDateTime(Date createdDateTime)
	{
		this.createdDateTime = createdDateTime;
	}

	public String getCreatedBy()
	{
		return createdBy;
	}

	public void setCreatedBy(String createdBy)
	{
		this.createdBy = createdBy;
	}

	public Date getUpdatedDateTime()
	{
		return updatedDateTime;
	}

	public void setUpdatedDateTime(Date updatedDateTime)
	{
		this.updatedDateTime = updatedDateTime;
	}

	public String getUpdatedBy()
	{
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy)
	{
		this.updatedBy = updatedBy;
	}
}
