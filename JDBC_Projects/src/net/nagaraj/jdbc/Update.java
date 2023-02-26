package net.nagaraj.jdbc;
import java.sql.*; 
public class Update { 
 public static void main(String[] args) throws Exception 
 { 
 //String driver="oracle.jdbc.OracleDriver"; 
 String jdbc_url="jdbc:mysql://localhost:3306/school"; 
 String user="root"; 
String pwd="Naga@123"; 
//Class.forName(driver); 
 String sql_query="update emp set esal=100 where ename='Nagaraj'"; 
// Class.forName(driver); 
 Connection con = DriverManager.getConnection(jdbc_url,user,pwd); 
Statement st = con.createStatement(); 
 int updateCount=st.executeUpdate(sql_query); 
 System.out.println("The number of rows updated :"+updateCount); 
 con.close(); 
 } 


 }
