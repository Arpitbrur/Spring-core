package com.jsp.spring_annotation_xml.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "customer")
public class Customer {

	private int id;
	private String name;
	private String email;
	
	public Customer(@Value(value = "123")  int id,@Value(value = "Arpit")
	String name,@Value(value = "arpit@gmail.com") String email) {
		super();

		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public void display() {
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("email: "+email);
		
		
	}
	
	
}
