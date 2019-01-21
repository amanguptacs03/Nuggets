package com.assign.nugget_9;

import java.util.ArrayList;
import java.util.Scanner;

public class AddAndSearch {

	private static ArrayList<String> al = new ArrayList<String>();

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		String[] arr = { "mangesh", "mangesh1", "mangesh2" };

		for (String s : arr) {
			al.add(s);
		}

		System.out.println("enter the name you want to find \n");
		String f = obj.next();
		String ans = find(f);
		System.out.println(ans);

	}

	public static String find(String f) {

		if (al.contains(f)) {
			return "FOUND!!!";
		}

		return "NOT FOUND!!!";

	}

}
