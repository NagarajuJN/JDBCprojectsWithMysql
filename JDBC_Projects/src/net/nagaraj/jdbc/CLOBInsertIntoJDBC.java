//Program to insert CLOB(Character Large Objects) type file in the database
//
// create table with a name cities
// create table cities(name varchar2(10),history CLOB);
 

package net.nagaraj.jdbc;
 import java.sql.*; 
 import java.io.*;
public class CLOBInsertIntoJDBC {
	 
	 public static void main(String[] args) throws Exception 
	 { 
		 String jdbc_url="jdbc:mysql://localhost:3306/school"; 
		 String user="root"; 
		String pwd="Naga@123"; 
		//Class.forName(driver); 
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd); 
		
	 String sqlQuery="insert into cities values(?,?)"; 
	 PreparedStatement ps = con.prepareStatement(sqlQuery); 
	 ps.setString(1,"Bangalore"); 
	 File f = new File("Bangalore_history.txt"); 
	 FileReader fr = new FileReader(f); 
	 ps.setCharacterStream(2,fr); 
	 System.out.println("file is inserting from :"+f.getAbsolutePath()); 
	 int updateCount=ps.executeUpdate(); 
	 if(updateCount==1) 
	 { 
	 System.out.println(" text msg Record Inserted"); 
	 } 
	 else 
	 { 
	 System.out.println("text msg  Record Not Inserted"); 
	 } 
	 }

}
