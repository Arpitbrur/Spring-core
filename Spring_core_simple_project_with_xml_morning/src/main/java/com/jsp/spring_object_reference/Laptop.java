package com.jsp.spring_object_reference;

public class Laptop {

	Processor processor;
	
	
	
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}



	public void laptopname() {
		System.out.println("My Laptop has");
		processor.processorName();
	}
}
