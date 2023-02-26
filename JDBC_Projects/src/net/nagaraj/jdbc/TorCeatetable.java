package net.nagaraj.jdbc;
import java.sql.*; 	
public class TorCeatetable {

	 public static void main(String[] args) throws Exception 
{ 
//String driver="com.mysql.jdbc.Driver"; 
//String jdbc_url=" jdbc:mysql:///school"; 
//String user="root"; 
//String pwd="Naga@123"; 
String sql_query="create table emp(eno int,ename varchar(10),esal decimal,eaddr varchar(10));"; 
//Class.forName(driver); 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Naga@123");//jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger
Statement st = con.createStatement(); 
st.executeUpdate(sql_query); 
System.out.println("Table Created Successfully"); 
con.close(); 
 }


}
