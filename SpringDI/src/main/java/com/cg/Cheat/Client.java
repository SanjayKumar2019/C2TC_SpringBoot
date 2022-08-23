package com.cg.Cheat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {

	public static void main(String[] args) {
		/*Student s=new Student();
		s.cheating();*/
		ApplicationContext s=new ClassPathXmlApplicationContext("beans.xml");
		Student a =s.getBean("s",Student.class);
	    a.cheating();
	    
	    AnotherStudent s1 = s.getBean("s1",AnotherStudent.class);
	    s1.startcheating();
	    
	}

}
