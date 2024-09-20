package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerDemoApplication.class, args);
		
		System.out.println("Customer springBoot Started");
	}

}
