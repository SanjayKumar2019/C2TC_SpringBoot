package com.cg.Network;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
	
	ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
	
	Sim a=c.getBean("Sim",Sim.class);
	a.calling();
	a.data();

	
	
/*	VI a=c.getBean("VI",VI.class);
	System.out.println("Config loaded");
	a.calling();
	a.data();
	
	Jio b=c.getBean("Jio",Jio.class);
	System.out.println("Config loaded");
	b.calling();
	b.data();
	 <bean id="VI" class="com.cg.Network.VI"></bean>
 <bean id="Jio" class="com.cg.Network.Jio"></bean>*/
	

	
	
	}

}
