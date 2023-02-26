package net.nagaraj.jdbc;
import java.sql.*;
public class Type4DEmo
{
	public static void main(String[] args) throws Exception
	{																								 			    
		//Class.forName("com.mysql.jdbc.Driver");//ojdbc14.jar					oracle.jdbc.OracleDriver						
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Naga@123");//jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger
		Statement st = con.createStatement();
//		ResultSet rs=st.executeQuery("select * from student_data");
//		while(rs.next())
//		{
//			System.out.println(rs.getInt(1)+".."+rs.getString(2)+".."+rs.getString(3)+".."+rs.getInt(4));
//		}
//		con.close();
//		
		
		
		ResultSet rs=st.executeQuery("select * from student_info");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+".."+rs.getString(2)+".."+rs.getString(3)+".."+rs.getString(4)+".."+rs.getInt(5)+".."+rs.getDate(6));
		}
		con.close();
	}
	}

