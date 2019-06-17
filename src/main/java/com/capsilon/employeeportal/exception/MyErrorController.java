package com.capsilon.employeeportal.exception;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/error")
public class MyErrorController implements ErrorController
{
	@RequestMapping
	public void error() throws NotFoundException
	{
		throw new NotFoundException();
	}

	@Override
	public String getErrorPath()
	{
		return "/error";
	}
}
