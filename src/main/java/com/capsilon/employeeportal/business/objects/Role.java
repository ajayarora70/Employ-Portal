package com.capsilon.employeeportal.business.objects;

public enum Role
{
	HR, ADMIN, EMPLOYEE, MANAGER;
	/*
	 * List<String> allRoles =
	 * Stream.of(Role.values()).map(Enum::name).collect(Collectors.toList());
	 * 
	 * public List<String> getAllRoles() { return allRoles; }
	 */
}
