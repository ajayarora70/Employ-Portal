package com.capsilon.employeeportal.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.MongoClient;

@Configuration
class Config extends AbstractMongoConfiguration
{
	@Value("${spring.data.mongodb.host}")
	private String host;

	@Value("${spring.data.mongodb.port}")
	private String port;

	@Value("${spring.data.mongodb.database}")
	private String database;

	@Bean
	MongoTransactionManager transactionManager(MongoDbFactory dbFactory)
	{
		return new MongoTransactionManager(dbFactory);
	}

	@Override
	public MongoClient mongoClient()
	{
		return new MongoClient(host, Integer.parseInt(port));
	}

	@Override
	protected String getDatabaseName()
	{
		return database;
	}
}
