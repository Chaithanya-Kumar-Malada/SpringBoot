package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exceptions.CustomerAlreadyExist;
import com.example.demo.Exceptions.CustomerNotFound;
import com.example.demo.Exceptions.EnterAlltheFields;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository cus_repo;

	public List<Customer> getAllCustomers() {
		
		return cus_repo.findAll();
	}
	
	public Customer getcustomerById(long id) throws CustomerNotFound {	
		
		Customer existing = cus_repo.findById(id).orElse(null);
		
		if(existing==null) {
			throw new CustomerNotFound("Customer with Id "+id+" Not Found. Try with another ID");
		}
		
		return existing;
	}

	public void addCustomer(Customer c1) throws CustomerAlreadyExist{
		
		Customer existing = cus_repo.findById(c1.getCust_id()).orElse(null);
		
		if(existing!=null) {
			throw new CustomerAlreadyExist("Customer Already Existed with ID. Enter another Id try again");	
		}
		cus_repo.save(c1);
	}
	

	
	public void deletecustomer(long id) throws CustomerNotFound{
		
		Customer existing = cus_repo.findById(id).orElse(null);
		
		if(existing ==null) {
			throw new CustomerNotFound("Customer with Id "+id+" Not Found. Try with another ID");
		}
		
		cus_repo.deleteById(id);
	}

	public void updateCustomer(long id,Customer c1)throws CustomerNotFound,EnterAlltheFields {
		
		Customer existing = cus_repo.findById(id).orElse(null);
		
		if(existing ==null) {
			throw new CustomerNotFound("Customer with Id "+id+" Not Found. Try with another ID");
		}
		
		if( c1.equals(null) || c1.getCust_name()==null || c1.getEmailid()==null || c1.getContactno()==null) {
			throw new EnterAlltheFields("Enter all the Fields : cust_id, cust_name, emailid, contactno");
		}
		
		
		existing.setCust_id(c1.getCust_id());
		existing.setCust_name(c1.getCust_name());
		existing.setEmailid(c1.getEmailid());
		existing.setContactno(c1.getContactno());
		
		cus_repo.save(existing);
		
	}

	public void patchCustomer(long id, Customer c1) throws CustomerNotFound{
	
		Customer existing = cus_repo.findById(id).orElse(null);
		
		if(existing ==null) {
			throw new CustomerNotFound("Customer with Id "+id+" Not Found. Try with another ID");
		}
		
		if(existing.getCust_id()==id) {
			
			if(c1.getCust_name() !=null) {
				
				existing.setCust_name(c1.getCust_name());
			}
			if(c1.getEmailid() != null) {
				existing.setEmailid(c1.getEmailid());
			}
			if(c1.getContactno() != null) {
				existing.setContactno(c1.getContactno());
			}
			
			//existing.setCust_id(c1.getCust_id());
			cus_repo.save(existing);
			
		}
		
	}

	
	
	
	
	
	
	
}
