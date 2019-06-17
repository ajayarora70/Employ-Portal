package com.capsilon.employeeportal.advice;

import org.slf4j.Logger;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capsilon.employeeportal.exception.ApplicationException;
import com.capsilon.employeeportal.exception.ErrorResponse;
import com.capsilon.employeeportal.exception.ErrorResponseEnum;
import com.capsilon.employeeportal.exception.ValidationException;

@RestControllerAdvice(basePackages = { "com.capsilon.employeeportal" })
public class ExceptionHandlerAdvice
{
	private static final Logger logger = org.slf4j.LoggerFactory.getLogger(ExceptionHandlerAdvice.class);

	@ExceptionHandler({ ValidationException.class })
	public @ResponseBody ResponseEntity<ErrorResponse> handleValidationException(ValidationException ValidationException)
	{
		logger.warn("ValidationException is thrown : ");
		// Create error response object.
		ErrorResponse errorResponse = new ErrorResponse(ValidationException.getErrorResponse().getCode(), ValidationException.getErrorResponse().getErrorText(), ValidationException.getValidationError(), ValidationException.getValidationErrorList());
		logger.warn(errorResponse.toString());
		// Return error response with status.
		return new ResponseEntity<>(errorResponse, ValidationException.getErrorResponse().getHttpStatus());
	}

	@ExceptionHandler({ ApplicationException.class })
	public @ResponseBody ResponseEntity<ErrorResponse> handleApplicationException(ApplicationException ApplicationException)
	{
		logger.warn("RuntimeException is thrown : ");
		// Create error response object.
		ErrorResponse errorResponse = new ErrorResponse(ApplicationException.getErrorResponse().getCode(), ApplicationException.getMessage());
		logger.warn(errorResponse.toString());
		// Return error response with status.
		return new ResponseEntity<>(errorResponse, ApplicationException.getErrorResponse().getHttpStatus());
	}

	@ExceptionHandler({ NotFoundException.class })
	public @ResponseBody ResponseEntity<ErrorResponse> handleNotFoundException(Throwable throwable)
	{
		logger.warn(throwable.getMessage(), throwable);
		ErrorResponse errorResponse = new ErrorResponse(ErrorResponseEnum.RESOURCE_NOT_FOUND.getCode(), ErrorResponseEnum.RESOURCE_NOT_FOUND.getErrorText());
		logger.error(errorResponse.toString());
		return new ResponseEntity<>(errorResponse, ErrorResponseEnum.RESOURCE_NOT_FOUND.getHttpStatus());
	}

	@ExceptionHandler({ Throwable.class })
	public @ResponseBody ResponseEntity<ErrorResponse> handleException(Throwable throwable)
	{
		logger.error(throwable.getMessage(), throwable);
		ErrorResponse errorResponse = new ErrorResponse(ErrorResponseEnum.GENERAL_ERROR.getCode(), ErrorResponseEnum.GENERAL_ERROR.getErrorText());
		logger.error(errorResponse.toString());
		return new ResponseEntity<>(errorResponse, ErrorResponseEnum.GENERAL_ERROR.getHttpStatus());
	}
}
