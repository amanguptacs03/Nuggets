package com.assign.nugget_2;

public class isAvailable {
	
	
	public static String[] initProductNames() {

		String[] str = { "black cloth", "mi redmi mobile black blue",
				"induction usable utensil cooker", "HP dell lenevo laptop",
				"chair table black wooden furniture" };

		return str;
	}

	public static boolean isPresent(String[] productNames, String keyword) {
		keyword = keyword.toUpperCase();
		for (String i : productNames) {

			if (i.toUpperCase().contains(keyword))
				return true;

		}

		return false;
	}
	

	public static void main(String[] args) {

		
	}

}
