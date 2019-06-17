package com.capsilon.employeeportal.util;

public class Utils
{
	public static void isNotNullAndNotEmpty(String fieldName, String str, boolean throwException) throws Exception
	{
		if (null == str || str.trim().isEmpty())
		{
			throwException(fieldName);
		}
	}

	public static void isIntegerValid(String fieldName, Integer integer, boolean throwException) throws Exception
	{
		if (integer == 0)
		{
			throwException(fieldName);
		}
	}

	public static void throwException(String fieldName) throws Exception
	{
		throw new Exception("Field '" + fieldName + "' cannot be null/empty");
	}

	public static String getSingleQuotedString(Object o)
	{
		return "'" + String.valueOf(o) + "'";
	}
}
