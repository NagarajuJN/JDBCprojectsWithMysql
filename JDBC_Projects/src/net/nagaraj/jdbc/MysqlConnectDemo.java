package net.nagaraj.jdbc;

import java.sql.*;
class MySQLConnectDemo 
{
	public static void main(String[] args) throws Exception
	{
		//Class.forName("com.mysql.jdbc.Driver"); ");//ojdbc14.jar					oracle.jdbc.OracleDriver				
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Naga@123");//jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery("select * from student_data");
		System.out.println("Student_ID\tStudent_Name\tCity\tAge");
		System.out.println("--------------------------------------");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+"           "+rs.getString(3)+"              "+rs.getInt(4));
		}
		con.close();
	}
}
