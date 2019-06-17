package com.capsilon.employeeportal.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.capsilon.employeeportal.document.DBEmployee;
import com.capsilon.employeeportal.repository.UserRepository;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {


    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return strings -> {
            userRepository.save(new DBEmployee(1, "Peter", "Development", 3000L));
            userRepository.save(new DBEmployee(2, "Sam", "Operations", 2000L));
        };
    }

}
