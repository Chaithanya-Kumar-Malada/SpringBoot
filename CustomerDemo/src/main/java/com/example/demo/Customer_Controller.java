package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exceptions.CustomerAlreadyExist;
import com.example.demo.Exceptions.CustomerNotFound;
import com.example.demo.Exceptions.EnterAlltheFields;

@RestController
public class Customer_Controller {

	@Autowired
	CustomerService cus_ser;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers(){
		return cus_ser.getAllCustomers(); 
	}
	
	@GetMapping("/customer/{id}")
	public Customer getcustomerById(@PathVariable long id)throws CustomerNotFound {
		
		return cus_ser.getcustomerById(id);
	}
	
	@PostMapping("/customer")
	public String addCustomer(@RequestBody Customer c1) throws CustomerAlreadyExist {
		
		cus_ser.addCustomer(c1);
		return "Customer Added ";
	}
	
	
	@PutMapping("/customer/{id}")
	public String updateCustomer(@PathVariable long id , @RequestBody Customer c1) throws CustomerNotFound,EnterAlltheFields {
		cus_ser.updateCustomer(id,c1);
		return "Customer Updated sucessfully";
	}
	
	@PatchMapping("/customer/{id}")
	public String patchCustomer(@PathVariable long id , @RequestBody Customer c1) throws CustomerNotFound{
		cus_ser.patchCustomer(id,c1);
		return "Customer patch Updated sucessfully";
	}
	
	@DeleteMapping("/customer/{id}")
	public String deletecustomer(@PathVariable long id) throws CustomerNotFound {
		
		cus_ser.deletecustomer(id);
		return "Customer Deleted";
	}
	
	
	
	
	
	
}
