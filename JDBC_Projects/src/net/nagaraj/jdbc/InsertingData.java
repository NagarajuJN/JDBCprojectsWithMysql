package net.nagaraj.jdbc;
import java.sql.*; 


public class InsertingData {
	public static void main(String[] args) throws Exception { 
		 //String driver="com.mysql.jdbc.Driver"; 
		String jdbc_url="jdbc:mysql://localhost:3306/school"; 
		 String user="root"; 
		String pwd="Naga@123"; 
		//Class.forName(driver); 
		String sql_query="insert into emp values(1,'Nagaraj',10000,'Bang')";
		Connection con=DriverManager.getConnection(jdbc_url,user,pwd);//jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger
		 Statement st = con.createStatement(); 
		 st.executeUpdate(sql_query);
		 
		 int updateCount=st.executeUpdate(sql_query); 
		 System.out.println("The number of rows inserted :"+updateCount);
		 
		 con.close(); 
		 } }



