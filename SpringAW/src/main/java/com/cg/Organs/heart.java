package com.cg.Organs;

public class heart {
	
	private String nameofAnimal;
	private int getNoofheart;
	
	
	


	public String getNameofAnimal() {
		return nameofAnimal;
	}





	public void setNameofAnimal(String nameofAnimal) {
		this.nameofAnimal = nameofAnimal;
	}





	public int getGetNoofheart() {
		return getNoofheart;
	}





	public void setGetNoofheart(int getNoofheart) {
		this.getNoofheart = getNoofheart;
	}





	void pumping() {
		System.out.println("The name of animal is:" + nameofAnimal);
		System.out.println("number of heart is:" + getNoofheart);
		System.out.println("Heart pumps!");
	}
	heart(){
		System.out.println("You are still alive!!");
		
	}

}
