package com.cg.Organs;

public class Human {
	private heart h;
	

	public Human(heart h) {
		super();
		this.h = h;
	}


	void StartPumping() {
		h.pumping();
		
	}

}
