package com.persistent.app;

import java.util.Random;

public class Advisor {
	String[] message;

	public Advisor(){
	message= new String[]{"Never Give Up ","Life Is All About A Second Chance ","Try To Do It ","Respect Parent","Go Ahead"};//--->IMPORTANT
	
	}
	Random r;
	public String getAdvice(){
		
    int i=new Random().nextInt(5);
		return message[i];
	}
	
}
