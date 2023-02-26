package net.nagaraj.jdbc;
import java.sql.*; 
import java.util.*;
import java.io.*;

public class Display {
	public static void main(String[] args) throws Exception
	{
		
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Naga@123");//jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery("select * from emp");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
		}		
		con.close();
	}


}
