package com.assign.nugget_4;

public class Tablet extends Medicine{
	
	public Tablet() {
		super("LUPIN", "BHOPAL");
		
	}

	public  void displayLabel(){
		super.displayLabel();
		System.out.println("TABLET :"+String.format("%50s", "Store in cool and dry place"));
		System.out.println("---------------------------------------");
	}
}
