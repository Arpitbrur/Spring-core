package com.jsp.Spring_core_simple_project.constructor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileDriver {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("mySpring.xml");
		Mobile mobile =	(Mobile) applicationContext.getBean("myMobile");
		
		mobile.display();
		applicationContext.close();
	}
}
