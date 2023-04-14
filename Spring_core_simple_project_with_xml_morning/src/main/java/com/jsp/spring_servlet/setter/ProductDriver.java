package com.jsp.spring_servlet.setter;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductDriver {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("Student.xml");
		
		Product product= (Product)	applicationContext.getBean("productDetail");
		
		System.out.println(product.getProductId());
		System.out.println(product.getProductName());
		System.out.println(product.getProductPrice());
		System.out.println(product.getClass().getName());
		
		
		
	}

}
