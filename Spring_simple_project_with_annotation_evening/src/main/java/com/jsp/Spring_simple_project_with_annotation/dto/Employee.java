package com.jsp.Spring_simple_project_with_annotation.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//variable constructor
@Component(value="Employee")
public class Employee {

	@Value(value="123")
	private int id;
	
	@Value(value="Arpit")
	private String name;
	
	@Value(value="arpit@gmail.com")
	private String email;
	

	public void displayEmployee() {
		System.out.println("id:-"+id);
		System.out.println("name:-"+name);
		System.out.println("email:-"+email);
	}
}
