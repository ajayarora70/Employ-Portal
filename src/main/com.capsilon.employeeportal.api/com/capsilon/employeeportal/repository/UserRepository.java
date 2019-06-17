package com.capsilon.employeeportal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capsilon.employeeportal.document.DBEmployee;

public interface UserRepository extends MongoRepository<DBEmployee, Integer> {
}
