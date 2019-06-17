package com.capsilon.employeeportal.document;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employee_salary_history")
public class DBEmployeeSalaryHistory extends DBEmployeeHistoryBase {

	Integer salary;

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

}
