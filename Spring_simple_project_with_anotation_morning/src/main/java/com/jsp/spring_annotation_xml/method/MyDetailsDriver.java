package com.jsp.spring_annotation_xml.method;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDetailsDriver {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-Config.xml");
		MyDetails details = (MyDetails) applicationContext.getBean("details");
		details.displayMyDetails();
	}
}
