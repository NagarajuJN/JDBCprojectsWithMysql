//Java code  to  insert BLOB type into database:
// create a table with a person name
//
//create table person(name varchar2(10),image BLOB)


package net.nagaraj.jdbc;
import java.io.*;
import java.sql.*;

public class BLOBinJDBC1 {
	 public static void main(String[] args) throws Exception
	 { 
			String jdbc_url="jdbc:mysql://localhost:3306/school"; 
			 String user="root"; 
			String pwd="Naga@123"; 
			//Class.forName(driver); 
			Connection con = DriverManager.getConnection(jdbc_url,user,pwd); 

			
			String sqlQuery="insert into persons values(?,?)"; 
			PreparedStatement ps = con.prepareStatement(sqlQuery); 
			 ps.setString(1,"Abd"); 
			 File f = new File("Abd.jpg"); 
			 FileInputStream fis = new FileInputStream(f); 
			 ps.setBinaryStream(2,fis); 
			 System.out.println("inserting image from :"+f.getAbsolutePath()); 
			 int updateCount=ps.executeUpdate(); 
			 if(updateCount==1) 
			 { 
			 System.out.println(" BLOB Record Inserted"); 
			 } 
			 else {
				  System.out.println("BLOB Record Not Inserted"); 

			 }
	 }

}
