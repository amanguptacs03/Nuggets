package com.assign.nugget_4;

public class Ointment extends Medicine {
	public Ointment() {
		super("PERSISTENT", "NAGPUR");
		// TODO Auto-generated constructor stub
	}

	public  void displayLabel(){
		super.displayLabel();
		System.out.println("OINTMENT :"+String.format("%50s", "For external use only"));
		System.out.println("---------------------------------------");
	}
}
