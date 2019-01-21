package com.assign.nugget_9;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	
	private static Vector<Name> v =new Vector<Name>();

	
	public static void main(String[] args) {
		
		Scanner obj= new Scanner(System.in);
		showUI();
		int i=obj.nextInt();
		int  count=0;
		boolean flag =true;
		while(flag){
		switch (i) {
		case 1:
		{
			System.out.println(":Enter First Name");
			String fname=obj.next();
			System.out.println(":Enter Second Name");
			String lname=obj.next();
			Name n=new Name(fname, lname);
			v.add(n);
			System.out.println("enter your choice again");
			i=obj.nextInt();
			break;
		}
		
		case 2:
		{
			for(Name s:v)
			{
				
				System.out.println(s.getFname()+" "+s.getLname());
				count++;
				
			}
			System.out.println("OVERALL NAME ENTERED : "+count);
			System.out.println("=====================================");
			System.out.println("enter your choice again");
			i=obj.nextInt();
				break;
		}
		case 3:
		{
			flag=false;
		System.out.println("FEEL FREE ");
		break;
		}
		
		default:{
			System.out.println("please enter a valid option");
			i=obj.nextInt();
			break;}
		}
		}
	}
	
	public static void showUI(){
		System.out.println("=======================================================");
		System.out.println("OPTIONS \n");
		System.out.println(String.format("%15s"," ")+ "1. Accept FirstName and Surname");
		System.out.println(String.format("%15s"," ")+ "2. Display Complete Name");
		System.out.println(String.format("%15s"," ")+ "3. Exit");
		System.out.println("\n\n\n Enter Your Choice");
		
		
		
	}
}
