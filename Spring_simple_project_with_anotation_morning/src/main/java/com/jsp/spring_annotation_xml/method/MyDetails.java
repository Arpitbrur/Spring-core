package com.jsp.spring_annotation_xml.method;

import org.springframework.stereotype.Component;

@Component(value = "details")
public class MyDetails {

	public void displayMyDetails() {
		System.out.println("this is my folder");
		
	}
}
