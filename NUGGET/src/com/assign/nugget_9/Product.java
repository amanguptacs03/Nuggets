package com.assign.nugget_9;

import java.util.HashMap;
import java.util.Scanner;


public class Product {

	private static String productID,productName;
private static	HashMap< String,String> hs =new HashMap<String,String>(10);
	
	
	
	public static void main(String[] args) {
		
	Scanner obj=new Scanner(System.in);
			hs.put("P001", "Maruti800");
			hs.put("P002", "MarutiZen");
			hs.put("P003", "MarutiEsteem");
		
		
		System.out.println("SEARCH AND REMOVE");
		System.out.println("=======================");
		System.out.println("Enter key of the product");
		String s=obj.next();
		boolean flag=search(s);
		if(flag)
		remove(s);
		
		
	
	}
	
	public static boolean search(String k){
		for(String key :hs.keySet()){
			if(k.equalsIgnoreCase(key))
			{
				System.out.println("Search product is:   "+key+"    "+hs.get(key));
				return true;
			}
		}
		return false;
	}
	
public static void remove(String key){
		hs.remove(key);
		System.out.println("NEW PRODUCT LIST : \n");
		for(String k:hs.keySet())
		System.out.println(k +" "+hs.get(k));

}
}
