
//Program For Retrieving CLOB Type from Database:

package net.nagaraj.jdbc;

import java.sql.*; 
import java.io.*; 
public class CLOBretrivefromDB {
	public static void main(String[] args) throws Exception 
	 { 
		 String jdbc_url="jdbc:mysql://localhost:3306/school"; 
		 String user="root"; 
		String pwd="Naga@123"; 
		//Class.forName(driver); 
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd); 
		
		PreparedStatement ps = con.prepareStatement("select * from cities"); 
		ResultSet rs =ps.executeQuery(); 
		FileWriter fw = new FileWriter("output_Bang.txt"); 
		if(rs.next()) 
		 { 
		 String name=rs.getString(1); 
		 Reader r = rs.getCharacterStream(2); 
		 /*char[] buffer = new char[1024];
		) while(r.read(buffer)>0)
		 {
		 fw.write(buffer);
		*/ 
		 int i=r.read(); 
		 while(i != -1) 
		 { 
		 fw.write(i); 
		 i = r.read(); 
		 } 
		 fw.flush(); 
		 System.out.println("Retrieved Successfully file :output_Bang.txt"); 
		 } 
		 con.close(); 
		 } 
		 } 
		
		
		
		
		


