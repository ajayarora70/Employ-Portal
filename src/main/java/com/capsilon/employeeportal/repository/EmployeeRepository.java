package com.capsilon.employeeportal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capsilon.employeeportal.document.DBEmployee;

public interface EmployeeRepository extends MongoRepository<DBEmployee, Integer>
{
}
