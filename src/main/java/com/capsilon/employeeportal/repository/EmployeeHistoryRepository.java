package com.capsilon.employeeportal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capsilon.employeeportal.document.DBEmployeeHistory;

public interface EmployeeHistoryRepository extends MongoRepository<DBEmployeeHistory, Integer>
{
}
