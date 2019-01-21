package com.assign.nugget_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
	private static File source,dest;

	public static void main(String[] args) throws IOException {
		
		
		
		
		
		String s;
		char ch;
		Scanner obj =new Scanner(System.in);
		
		
		source=new File(args[0]);
		dest=new File(args[1]);
		if(!source.exists())
		{
			System.out.println("Source file doesn't exixt");
		}
		else{
			
			
			if(dest.exists()){
				
				System.out.println("DO you Want to overwrite the file: (y/n)");
				s=obj.next();
				ch=s.charAt(0);
		
				if(ch=='y'){
					write(dest);
				}
				else
					System.out.println("Operation Cancelled.");
			}
			else{
				write(dest);
			}
			
		}
		
		
		
}
	public static void  write(File dest) throws IOException{
		FileReader fr=new FileReader(source);	
		FileWriter fw=new FileWriter(dest);
		while(fr.ready()){
			fw.write((char)fr.read());
		}
		System.out.println("Copied Successfully.");
		fr.close();
		fw.close();
	}
}

