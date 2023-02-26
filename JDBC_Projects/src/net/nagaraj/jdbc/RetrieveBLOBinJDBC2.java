
package net.nagaraj.jdbc;
import java.io.*;
import java.sql.*;

public class RetrieveBLOBinJDBC2 {
	public static void main(String[] args) throws Exception
	 { 
			String jdbc_url="jdbc:mysql://localhost:3306/school"; 
			 String user="root"; 
			String pwd="Naga@123"; 
			//Class.forName(driver); 
			Connection con = DriverManager.getConnection(jdbc_url,user,pwd); 
			
			PreparedStatement ps = con.prepareStatement("select * from persons"); 
			 ResultSet rs =ps.executeQuery(); 
			 FileOutputStream os = new FileOutputStream("virat.jpeg"); 
			 if(rs.next()) 
			 { 
			 String name=rs.getString(1); 
			 InputStream is = rs.getBinaryStream(2); 
			 byte[] buffer = new byte[2048]; 
			 while(is.read(buffer)>0) 
			 { 
			 os.write(buffer); 
			 } 
			 os.flush(); 
			 System.out.println("image is available in :virat.jpeg"); 
			 } 
			 con.close(); 
			 } 
			 }


