package com.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
	
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306";
		String username="root";
		String password="root";
				
	  try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url,username,password);
		
		Statement stmt=con.createStatement();
		String query="insert into practjdbc.student values(8,'mari','mechanical')";
		stmt.execute(query);
		con.close();
		System.out.println("Inserted");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
