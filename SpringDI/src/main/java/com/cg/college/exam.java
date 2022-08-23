package com.cg.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class exam {

	public static void main(String[] args) {
		
		
		ApplicationContext s=new ClassPathXmlApplicationContext("beans.xml");
		
		Student student=s.getBean("s",Student.class);
		student.display();
    
		Student student1=s.getBean("s1",Student.class);
		student1.display();
	}
}
