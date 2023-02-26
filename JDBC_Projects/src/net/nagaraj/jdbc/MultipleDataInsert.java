package net.nagaraj.jdbc;
import java.sql.*;
import java.util.*;

public class MultipleDataInsert {



	public static void main(String[] args) throws Exception
	{
		String jdbc_url="jdbc:mysql://localhost:3306/school"; 
		 String user="root"; 
		String pwd="Naga@123"; 
		//Class.forName(driver); 
		Connection con=DriverManager.getConnection(jdbc_url,user,pwd);//jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger
		 Statement st = con.createStatement(); 

		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Employee Number:");
			int eno=sc.nextInt();
			System.out.println("Employee Name:");
			String ename=sc.next();
			System.out.println("Employee Sal:");
			int esal=sc.nextInt();
			System.out.println("Employee Address:");
			String eaddr=sc.next();
			String sqlQuery=String.format("insert into emp values(%d,'%s',%d,'%s')",eno,ename,esal,eaddr); 
			 st.executeUpdate(sqlQuery); 
			 System.out.println("Record Inserted Successfully");
			System.out.println("Do U want to Insert one more record[Yes/No]:");
			String option = sc.next();
			if(option.equalsIgnoreCase("No"))
			{
				break;
			}
		}
		con.close();
	}
}
