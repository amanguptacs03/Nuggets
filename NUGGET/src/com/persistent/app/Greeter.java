package com.persistent.app;

public class Greeter {

	
	private String name;
	
	public Greeter(String string) {
	name=string;
	}
	public  String sayHello(){
		return "Hello,"+this.name+"!";
		
	}
	public  String sayGoodBye(){
		return "GoodBye "+this.name+"!";
		
	}
}
