package com.jsp.spring_object_reference;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopDriver {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("Student.xml");
		Laptop laptop = (Laptop) applicationContext.getBean("myLAptop"
				+ "");
		laptop.laptopname();
	}
}

