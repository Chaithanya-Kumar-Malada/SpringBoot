package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student_Controller {

	
	List<Student> StudentList = new ArrayList<>( Arrays.asList(
									
							    new Student(1,"surya",24),
							    new Student(2,"Chaithanya",15),
							    new Student(3,"Anju",26),
							    new Student(4,"priya",14),
							    new Student(5,"Lav",42)          ));
	
	List<Student> sort = StudentList.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
	
	int length = StudentList.size();
	
	List<String> names = StudentList.stream().map(i->i.getName()).collect(Collectors.toList());
	
	List<Student> AgeLimit = StudentList.stream().filter(i->i.getAge()>18).collect(Collectors.toList());
	
	@RequestMapping("/list")
	public List<Student> List(){
		
			return StudentList;
	}
	
	@RequestMapping("/length")
	public int Length() {
		return length;
	}
	
	@RequestMapping("/names")
	public List<String> names() {
		
		return names;
	}
	
	@RequestMapping("/agelimit")
	public List<Student> AgeLimit(){
		return AgeLimit;
	}
	
	
	@RequestMapping("/sort")
	public List<Student> sorting(){
		return sort;
	}
	
	
	
	
	
}
