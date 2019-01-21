package com.assign.nugget_10;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DBops {
	static Connection conn=null;
	public static void truncate(){
	try{
		if(conn==null){
			Connection conn=new com.assign.nugget_10.Connection().getConnection();
			PreparedStatement ps=conn.prepareStatement("truncate showdetails");
			ps.executeUpdate();
		}
	}catch(Exception e){
	e.printStackTrace();
	}
}
}