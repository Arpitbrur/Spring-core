package com.jsp.spring_servlet;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {

	public static void main(String[] args) {
		
//		Student student = new Student();
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("Student.xml");
		
		applicationContext.getBean("studentId");
//		applicationContext.close();
	}
}
