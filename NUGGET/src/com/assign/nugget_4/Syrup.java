package com.assign.nugget_4;

public class Syrup extends Medicine {
	public Syrup() {
		super("COGNI", "PUNE");
		// TODO Auto-generated constructor stub
	}

	public  void displayLabel(){
		super.displayLabel();
		System.out.println("SYRUP :"+String.format("%50s", "Close the cap after use"));
		System.out.println("---------------------------------------");
	}
}
