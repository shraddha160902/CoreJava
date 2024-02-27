package BankingApplication;

import java.sql.*;
public class account {
	
	public static void main(String[] args) throws Exception 
	{
		try
		{
		//Class.forName("com.mysql.cj.jdbc.driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
		System.out.println("Connection Established");
		
		Statement st=con.createStatement();
		
		String sql="insert into accounts"+"(acc_no,acc_id,cust_id,balance)"+"values(1008,8,118,20000)";
		//String sql2="insert into accounts"+"(acc_no,acc_id,cust_id,balance)"+"values(1006,6,116,70000)";
		
		st.executeUpdate(sql);
		//st.executeUpdate(sql1);
		
		System.out.println("Insertion completed");
		
		String sql1="delete from  accounts where acc_id=6";
		st.executeUpdate(sql1);
		
		ResultSet rs=st.executeQuery("select * from accounts");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getInt(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4)+"\t");
			
		}
		
		con.close();
		st.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
