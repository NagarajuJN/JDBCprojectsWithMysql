package net.nagaraj.jdbc;
import java.sql.*;

public class JdbcPreparedStatementDemo {
	public static void main(String[] args) throws Exception 
	 { 
	String jdbc_url="jdbc:mysql://localhost:3306/school"; 
	 String user="root"; 
	String pwd="Naga@123"; 
	//Class.forName(driver); 
	Connection con=DriverManager.getConnection(jdbc_url,user,pwd);//jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger
	 Statement st = con.createStatement(); 
	 String sqlQuery ="delete from Student_info where first_name=?";

	 PreparedStatement pst = con.prepareStatement(sqlQuery);
	
	  pst.setString(1,"Mallika");
	  
	 int  updateCount=pst.executeUpdate();
	  System.out.println("The number of rows deleted :"+updateCount);

	 System.out.println("Reusing PreparedStatement to delete one more record...");
	 pst.setString(1,"Nagaraj");
	 int updateCount1=pst.executeUpdate();
	 System.out.println("The number of rows deleted :"+updateCount1);
	 
	 con.close();
	 }

}
