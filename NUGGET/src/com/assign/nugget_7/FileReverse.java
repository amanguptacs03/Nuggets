package com.assign.nugget_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReverse {
	
	private static File f=new File("src/mangesh.txt");
	
public static void main(String[] args) throws IOException {
	
	String sentence="";
	
	FileReader fr=new FileReader(f);
	while(fr.ready()){
		char ch=(char)(fr.read());
		sentence+=ch;			
	}
	
	makeReverse(sentence);
}

public static String makeReverse(String s){
	String[] str=s.split(" ");
	for(String i: str){
		System.out.print(new StringBuffer(i).reverse().toString()+" ."
				+ "");
	}
	return null;
}
}
