package com.jsp.spring_servlet.Constructors;

public class Teacher {

	private int teacherId;
	private String teacherName;
	private String teacherEmail;
	
	public Teacher(int teacherId, String teacherName, String teacherEmail) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherEmail = teacherEmail;
	}
	
	public void displayTeacher() {
		System.out.println("id: "+teacherId);
		System.out.println("Name: "+teacherName);
		System.out.println("Email: "+teacherEmail);
	}
	
	
}
