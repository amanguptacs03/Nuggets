package com.assign.nugget_7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputRead {
	
	private static File f=new File("aman.txt");
	private static String str;

	
	public static void main(String[] args) throws IOException {

	
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a sting in file");
	
		str =obj.nextLine();
		input(str);
	
		
	}
	
	public static void input(String ch) throws IOException{
		
	
		FileWriter fw=new FileWriter(f);
		FileReader fr=new FileReader(f);
		fw.append(ch);
		fw.close();
		System.out.println("SIZE : "+f.length() +"BYTE");
		while(fr.ready()){
			System.out.print((char)(fr.read()));
		}
		f.delete();
		System.out.println("file deleted!!");
		
	}
}
