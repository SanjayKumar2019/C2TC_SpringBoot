package com.cg.Cheat;

public class Student {

	private MathCheat chit,p;
	
	public MathCheat getChit() {
		return chit;
	}

	public void setChit(MathCheat chit) {
		this.chit = chit;
	}

	void cheating() {
		chit.mathchit();
	}

}
/*        <bean id="s" class="com.cg.college.Student">
        <constructor-arg name="name" value="Krishna"></constructor-arg>
         <constructor-arg name="id" value="007"></constructor-arg>
        </bean>
        
        <bean id="s1" class="com.cg.college.Student">
        <constructor-arg name="name" value="Radha"></constructor-arg>
        <constructor-arg name="id" value="001"></constructor-arg>
        </bean>*/
