package com.assign.nugget_2;

public class Main {
public static void main(String[] args) {
	isAvailable ps = new isAvailable();
	String[] s = ps.initProductNames();
	boolean flag = ps.isPresent(s, "Hp blue");

	//System.out.println(flag);
//	System.out.println("position:"+NumSearch.findPosition(6,new int[]{1,26,3,4,5,56}));
//	System.out.println("Array:"+PrimeInRange.findPrime(2, 10));
for(int n:PrimeInRange.findPrime(2, 10)){
	//System.out.print(n+" ");
}
char ch[][] ={{'x','o','x'},
				{'x','o','o'},
				{'o','x','x'}};
System.out.println(TicTacToe.winner(ch));

}
}
