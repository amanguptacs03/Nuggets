package com.assign.nugget_10;
import java.sql.Date;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) throws IOException, SQLException, ParseException {
		
		DBops.truncate();
	BufferedReader br=new BufferedReader(new FileReader("src/movies.txt"));
	Scanner obj=new Scanner(System.in);
		
		String s,name,language,date;
		while((s=br.readLine())!=null){
			String[] detail=s.split(",");
			Movie m=new Movie(detail[1], detail[2]);
			m.newShow(sqlDate(detail[3]));
		}
			
			loop : while(true){
				showUI();
				switch (obj.nextInt()) {
				case 1:
				{
					System.out.println("enter the movie name");
					obj.nextLine();
					name=obj.nextLine();
					System.out.println("enter the language name");
					language=obj.nextLine();
					System.out.println("enter show date(d/m/yy)");
					date=obj.nextLine();
					Movie m1=new Movie(name, language);
					m1.newShow(sqlDate(date));
					break;
				}
				case 2:
				{
					System.out.println("enter the movie name");
					obj.nextLine();
					name=obj.nextLine();
					System.out.println("enter the language name");
					language=obj.nextLine();
					System.out.println("enter new show date(d/m/yy)  ");
					date=obj.nextLine();
					Movie m1=new Movie(name, language);
					m1.update(sqlDate(date));
					break;
				}
				case 3:
				{
					System.out.println("enter the movie name");
					obj.nextLine();
					name=obj.nextLine();
					System.out.println("enter the language name");
					language=obj.nextLine();
					System.out.println("enter show date(d/m/yy)  ");
					date=obj.nextLine();
					Movie m1=new Movie(name, language);
					m1.update(sqlDate(date));
					break;
				}
				case 4:
				{
					break loop;
				}
				

				default:
				{
					System.out.println("please enter a valid choice");
					break ;
				}
				
				}
			}
		}
	
	
	public static  Date sqlDate(String d) throws ParseException{
		
		SimpleDateFormat idf =new SimpleDateFormat("dd/M/y");
		return Date.valueOf(new SimpleDateFormat("yyyy-M-dd").format(idf.parse(d)));
		
	}
	public static void showUI(){
		
		System.out.println("--------------JDBC OPERATIONS-------------------");
		System.out.println("ENTER YOUR CHOICE");
		System.out.println("1. Add Movie\n 2.Update Show \n 3. Delete Show \n4.Exit");
		
	}
}
