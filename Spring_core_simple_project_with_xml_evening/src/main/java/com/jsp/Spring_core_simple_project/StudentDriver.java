package com.jsp.Spring_core_simple_project;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("mySpring.xml");
	Student student =	(Student) applicationContext.getBean("studentDetails");
	
		student.m1();
	}
	
}
