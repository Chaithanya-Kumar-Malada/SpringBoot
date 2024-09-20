package com.example.demo.Exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandling {

	@ExceptionHandler(CustomerNotFound.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	
	public Map<String,String> globalExceptionhandlesForCustomerNotFound( CustomerNotFound c1 ){
		
		Map<String,String> erorrmap = new HashMap<>();
		
		erorrmap.put("Error Message: ",c1.getMessage());
		
		return erorrmap;	
	}
	
	
	@ExceptionHandler(CustomerAlreadyExist.class)
	@ResponseStatus(HttpStatus.FOUND)
	public Map<String,String> globalExceptionCustomerAlreadyExist(CustomerAlreadyExist c1){
		
		Map<String,String> errormap = new HashMap<>();
		
		errormap.put("Error Mesaage: ", c1.getMessage());
		
		return errormap;
		
	}
	
	@ExceptionHandler(EnterAlltheFields.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public Map<String,String> globalExceptionEnterAlltheFields(EnterAlltheFields e1){
		
		Map<String,String> errormap = new HashMap<>();
		
		errormap.put("Error Mesaage: ", e1.getMessage());
		
		return errormap;
		
	}
	
	
	
}
