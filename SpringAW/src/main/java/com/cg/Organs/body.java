package com.cg.Organs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class body {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Human a = c.getBean("Human",Human.class);
		a.StartPumping();

	}

}
