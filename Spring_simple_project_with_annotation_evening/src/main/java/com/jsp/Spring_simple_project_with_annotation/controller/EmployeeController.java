package com.jsp.Spring_simple_project_with_annotation.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.Spring_simple_project_with_annotation.config.MyConfig;
import com.jsp.Spring_simple_project_with_annotation.dto.Employee;


public class EmployeeController {

	// variable constructor
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		// class name is always given in lower case when we take only @Component but when 
		// we take @Component(value="Employee") then we give lower as well as capital letter
		Employee employee = (Employee) applicationContext.getBean("Employee");
		employee.displayEmployee();
	}
}
