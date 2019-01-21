package com.assign.nugget_2;

public class NumSearch {
	public static int findPosition(int n,int[] arr){
		int pos=0	;	
		for(int i:arr){

pos++;
			if(i==n)
				return pos;
		}
		return -1;
	}
}
