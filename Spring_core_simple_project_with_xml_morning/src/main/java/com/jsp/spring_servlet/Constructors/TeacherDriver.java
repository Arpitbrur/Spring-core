package com.jsp.spring_servlet.Constructors;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherDriver {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("Student.xml");
		Teacher teacher= (Teacher) applicationContext.getBean("teacherId");
		
		teacher.displayTeacher();
		applicationContext.close();
	}
	
}
