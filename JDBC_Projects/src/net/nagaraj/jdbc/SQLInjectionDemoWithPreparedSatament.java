//
//create table users(uname varchar2(20),upwd varchar2(20)); 
// 
// insert into users values('Nagaraj','java'); 
//insert into users values('King','testing')

//
//Program to Demonstrate that there is no chance of SQL Injection Attack with 
//PreparedStatement object:
//	                          Not possible beacuse of preparedStatement




package net.nagaraj.jdbc;
import java.sql.*;
import java.util.*;
public class SQLInjectionDemoWithPreparedSatament {
	public static void main(String[] args) throws Exception 
	 { 
	String jdbc_url="jdbc:mysql://localhost:3306/school"; 
	 String user="root"; 
	String pwd="Naga@123"; 
	//Class.forName(driver); 
	Connection con = DriverManager.getConnection(jdbc_url,user,pwd); 
	Scanner sc = new Scanner(System.in); 
	 System.out.println("Enter username:"); 
	 String uname=sc.next(); 
	 System.out.println("Enter pwd:"); 
	 String upwd=sc.next(); 
	 String sqlQuery="select count(*) from users where uname=? and upwd=?"; 
	 PreparedStatement ps = con.prepareStatement(sqlQuery); 
	 ps.setString(1,uname); 
	 ps.setString(2,upwd); 
	 ResultSet rs =ps.executeQuery(); 
	 int c=0; 
	 if(rs.next()) 
	 { 
	 c=rs.getInt(1); 
	 if(c==0) 
		  System.out.println("Invalid Credentials"); 
		  else 
		  System.out.println("Valid Credentials"); 
		  
		 con.close(); 
		  } 
		  } 



}
