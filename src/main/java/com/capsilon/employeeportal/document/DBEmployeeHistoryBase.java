package com.capsilon.employeeportal.document;

import java.util.Date;

public class DBEmployeeHistoryBase extends DBRecord
{
	Date eventDate;

	public Date getEventDate()
	{
		return eventDate;
	}

	public void setEventDate(Date eventDate)
	{
		this.eventDate = eventDate;
	}
}
