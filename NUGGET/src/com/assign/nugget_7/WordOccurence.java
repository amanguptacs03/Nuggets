package com.assign.nugget_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WordOccurence {

	
	private static File f=new File("src/mangesh.txt");
	private static int count=0;
	
	public static void main(String[] args) throws IOException {
		String sentence="";
		String keyword="";
		FileReader fr=new FileReader(f);
		while(fr.ready()){
			char ch=(char)(fr.read());
			sentence+=ch;			
		}
	Check(sentence, "is");
	System.out.println("Count: "+count);
	}
			
			
	public static int Check(String sentence,String word) throws IOException{
		String[] str=sentence.split(" ");
		for(String i:str){
			if(i.equals(word)){
				count++;
			}
		}
	
	
		
		return count;
		}
		
	}

