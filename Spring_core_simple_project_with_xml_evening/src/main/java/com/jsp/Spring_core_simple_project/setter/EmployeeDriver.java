package com.jsp.Spring_core_simple_project.setter;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDriver {

	public static void main(String[] args) {
		// configurable Application Context  is use to read the xml file 
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("mySpring.xml");
		// now it is check EmployeeDetail is there or not.
		Employee employee = (Employee) applicationContext.getBean("empDetails");
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpEmail());
	}
}
