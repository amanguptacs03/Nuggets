package com.assign.nugget_2;

public class PrimeInRange {
public static int[] findPrime(int s,int e){
int j=0,count=0;
String str="";
	for(int i=s;i<=e;i++){
		if(isPrime(i)){
		str +=i+" ";
		count++;
		}
		
	}
	int[] arr= new int[count];
	for (String a:str.split(" ")){
		
		
	arr[j++]=	Integer.parseInt(a);
	}
	return arr;
}
public static boolean isPrime(int i){
	for(int k=2;k<=(int)(Math.sqrt(i));k++){
		if(i%k==0)
			return false;
	}
	return true;
}
}
