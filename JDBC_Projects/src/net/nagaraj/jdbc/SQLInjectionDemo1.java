//
//create table users(uname varchar2(20),upwd varchar2(20)); 
// 
// insert into users values('Nagaraj','java'); 
//insert into users values('King','testing')

//Program to Demonstrate SQL Injection Attack with Statement object:







package net.nagaraj.jdbc;
import java.sql.*;
import java.util.*;

public class SQLInjectionDemo1 {
	public static void main(String[] args) throws Exception 
	 { 
	String jdbc_url="jdbc:mysql://localhost:3306/school"; 
	 String user="root"; 
	String pwd="Naga@123"; 
	//Class.forName(driver); 
	Connection con = DriverManager.getConnection(jdbc_url,user,pwd); 
	 Statement st = con.createStatement(); 
	 Scanner sc = new Scanner(System.in); 
	 System.out.println("Enter username:"); 
	 String uname=sc.next(); 
	 System.out.println("Enter pwd:"); 
	 String upwd=sc.next(); 
	 String sqlQuery="select count(*) from users where uname='"+uname+"' and upwd='"+
	upwd+"'"; 
	 ResultSet rs =st.executeQuery(sqlQuery);
	 int c=0; 
	 if(rs.next()) 
	 { 
	 c=rs.getInt(1); 
	 } 
	if(c==0) 
	 System.out.println("Invalid Credentials"); 
	 else 
	 System.out.println("Valid Credentials"); 
	 con.close();
	 }

}
