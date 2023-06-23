package com.jsp.Spring_simple_project_with_annotation.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.Spring_simple_project_with_annotation.config.MyConfig;
import com.jsp.Spring_simple_project_with_annotation.dto.Laptop;

public class LaptopController {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Laptop laptop = (Laptop) applicationContext.getBean("myLaptop");
		
		laptop.displayLaptop();
	}
}
