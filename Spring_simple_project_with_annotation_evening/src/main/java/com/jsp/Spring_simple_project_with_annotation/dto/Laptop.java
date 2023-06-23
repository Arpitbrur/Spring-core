package com.jsp.Spring_simple_project_with_annotation.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component(value="myLaptop")
public class Laptop {

	private int id;
	private String name;
	private double price;
	
	
	public Laptop(@Value(value="123")int id, 
			@Value(value="Hp ")String name, 
			@Value(value="445000") double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public void displayLaptop() {
		System.out.println("id:-"+id);
		System.out.println("name:-"+name);
		System.out.println("price:-"+price);
	}
	
}
