package com.cg.college;

public class Student 
{
	private String name;
	private String id;
	

	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}


	void display()
	{
		System.out.println("Student name is "+ name);
		System.out.println("My Id = "+ id);
		
	}
}
