package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	private long cust_id;
	private String cust_name;
	private String emailid;
	private String contactno;
	
	public Customer(long cust_id, String cust_name, String emailid, String contactno) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.emailid = emailid;
		this.contactno = contactno;
	}

	public Customer() {
		super();
	}

	public long getCust_id() {
		return cust_id;
	}

	public void setCust_id(long cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	
	
	
	
}
