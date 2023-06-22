package com.jsp.Spring_core_simple_project.constructor;

public class Mobile {

	private int mobileId;
	private String mobileName;
	private String mobileColor;
	private double mobilePrice;
	
	
// to generate the constructor short cut key is :- Alt + S + A	
	public Mobile(int mobileId, String mobileName, String mobileColor, double mobilePrice) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.mobileColor = mobileColor;
		this.mobilePrice = mobilePrice;
	}
	
	public void display() {
		System.out.println("mobileId:- "+mobileId);
		System.out.println("mobileName:- "+mobileName);
		System.out.println("mobileColor:- "+mobileColor);
		System.out.println("mobilePrice:- "+mobilePrice);
	}
	

}
