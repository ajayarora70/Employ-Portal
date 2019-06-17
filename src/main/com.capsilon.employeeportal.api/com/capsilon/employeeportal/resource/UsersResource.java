package com.capsilon.employeeportal.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capsilon.employeeportal.document.DBEmployee;
import com.capsilon.employeeportal.repository.UserRepository;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    private UserRepository userRepository;

    public UsersResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public List<DBEmployee> getAll() {
        return userRepository.findAll();
    }
}
