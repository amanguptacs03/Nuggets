package com.assign.nugget_10;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Movie {

	private String name;
	private String language;

	public Movie(String name,String language) {
		super();
		this.name = name;
		this.language=language;
	}

	public void newShow(Date date) throws SQLException {
		Connection conn=com.assign.nugget_10.Connection.getConnection();
		PreparedStatement ps=conn.prepareStatement("insert into showdetails values(0,?,?,?)");
		ps.setString(1, this.name);
		ps.setString(2, this.language);
		ps.setDate(3, date);
int i=	ps.executeUpdate();
if(i>0)
	System.out.println("successfully added");
else
	System.out.println("failed :Add");


	}

	public void update(Date date) throws SQLException {
		Connection conn=com.assign.nugget_10.Connection.getConnection();
		PreparedStatement ps=conn.prepareStatement("update showdetails set `show` =? where movie =? and language=?");
		
		ps.setDate(1, date);
		ps.setString(2, name);
		ps.setString(3, language);
	int i=	ps.executeUpdate();
	if(i>0)
		System.out.println("successfully updated");
	else
		System.out.println("failed :Update");
	}

	public void delete(Date date) throws SQLException {
		Connection conn=com.assign.nugget_10.Connection.getConnection();
		PreparedStatement ps=conn.prepareStatement("delete from showdetails where movie=? and language=? and `show`=? ");
		ps.setString(1, this.name);
		ps.setString(2, this.language);
		ps.setDate(3, date);
		int i=ps.executeUpdate();
		if(i>0)
			System.out.println("successfully deleted");
		else
			System.out.println("failed :deletion");
		}

	}


