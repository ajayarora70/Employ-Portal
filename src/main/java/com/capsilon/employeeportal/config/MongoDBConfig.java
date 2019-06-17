package com.capsilon.employeeportal.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.util.ResourceUtils;

import com.capsilon.employeeportal.document.DBEmployee;
import com.capsilon.employeeportal.document.DBEmployeeDesignationHistory;
import com.capsilon.employeeportal.document.DBEmployeeHistory;
import com.capsilon.employeeportal.document.DBEmployeeSalaryHistory;
import com.capsilon.employeeportal.repository.EmployeeHistoryRepository;
import com.capsilon.employeeportal.repository.EmployeeRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

@EnableMongoRepositories(basePackageClasses = EmployeeRepository.class)
@Configuration
public class MongoDBConfig
{
	@Bean
	CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository, EmployeeHistoryRepository employeeHistoryRepository) throws IOException
	{
		if (employeeRepository.count() == 0)
		{
			employeeRepository.insert(new DBEmployee(99999));
			employeeRepository.deleteAll();
		}
		if (employeeHistoryRepository.count() == 0)
		{
			employeeHistoryRepository.insert(new DBEmployeeHistory(99999));
			employeeHistoryRepository.deleteAll();
		}
		/*Type listType = new TypeToken<List<DBEmployee>>()
		{
		}.getType();
		@SuppressWarnings("unchecked") List<DBEmployee> dbEmployees = (List<DBEmployee>) loadJson(listType, "classpath:employees.json");
		return strings -> {
			for (DBEmployee dbEmployee : dbEmployees)
			{
				employeeRepository.save(dbEmployee);
			}
			employeeRepository.save(new DBEmployee(1, "Peter", "peter@xyz.com", "Software Engineer", Role.EMPLOYEE.name()));
			employeeRepository.save(new DBEmployee(2, "Sam", "sam@xyz.com", "HR", Role.HR.name()));
			employeeRepository.save(new DBEmployee(3, "John", "john@xyz.com", "HR", Role.HR.name()));
		};*/
		return strings -> {
		};
	}

	/*@Bean
	CommandLineRunner commandLineRunner1(EmployeeHistoryRepository employeeHistoryRepository)
	{
		List<DBEmployeeDesignationHistory> dbEmployeeDesignationHistories = new ArrayList<DBEmployeeDesignationHistory>();
		DBEmployeeDesignationHistory dbEmployeeDesignationHistory = new DBEmployeeDesignationHistory();
		dbEmployeeDesignationHistory.setEventDate(new Date());
		dbEmployeeDesignationHistory.setDesignation("HR");
		dbEmployeeDesignationHistories.add(dbEmployeeDesignationHistory);
		sleep(1000L);
		dbEmployeeDesignationHistory = new DBEmployeeDesignationHistory();
		dbEmployeeDesignationHistory.setEventDate(new Date());
		dbEmployeeDesignationHistory.setDesignation("HR Manager");
		dbEmployeeDesignationHistories.add(dbEmployeeDesignationHistory);
		List<DBEmployeeSalaryHistory> dbEmployeeSalaryHistories = new ArrayList<DBEmployeeSalaryHistory>();
		DBEmployeeSalaryHistory dbEmployeeSalaryHistory = new DBEmployeeSalaryHistory();
		dbEmployeeSalaryHistory.setEventDate(new Date());
		dbEmployeeSalaryHistory.setSalary(30000);
		dbEmployeeSalaryHistories.add(dbEmployeeSalaryHistory);
		sleep(1000L);
		dbEmployeeSalaryHistory = new DBEmployeeSalaryHistory();
		dbEmployeeSalaryHistory.setEventDate(new Date());
		dbEmployeeSalaryHistory.setSalary(50000);
		dbEmployeeSalaryHistories.add(dbEmployeeSalaryHistory);
		return strings -> {
			employeeHistoryRepository.save(new DBEmployeeHistory(3, dbEmployeeDesignationHistories, dbEmployeeSalaryHistories));
		};
	}*/
	private void sleep(Long time)
	{
		try
		{
			Thread.sleep(time);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	public <T> T convertJSONToObject(Class<T> clazz, String filePath) throws IOException
	{
		Object o = null;
		ObjectMapper objectMapper = new ObjectMapper();
		try
		{
			File file = ResourceUtils.getFile(filePath);
			o = objectMapper.readValue(file, clazz);
		} catch (IOException e)
		{
			throw e;
		}
		return clazz.cast(o);
	}

	public static Object loadJson(Type type, String filePath) throws FileNotFoundException
	{
		Object jsonData = null;
		File file = ResourceUtils.getFile(filePath);
		InputStream inputStream = null;
		Gson gson = new GsonBuilder().enableComplexMapKeySerialization().setPrettyPrinting().create();
		try
		{
			inputStream = new FileInputStream(file);
			InputStreamReader streamReader = new InputStreamReader(inputStream, "UTF-8");
			jsonData = gson.fromJson(streamReader, type);
			streamReader.close();
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		} finally
		{
			if (inputStream != null)
			{
				try
				{
					inputStream.close();
				} catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		return jsonData;
	}
}
