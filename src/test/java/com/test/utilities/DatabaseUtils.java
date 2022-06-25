package com.test.utilities;

import java.sql.*;

public class DatabaseUtils {
	public Connection con;
	public ResultSet rs;
	public Statement st;

	public Connection connectDB()
	
	{
		try
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con=DriverManager.getConnection("jdbc:sqlserver://locathost;databaseName=abc;user=abc;password=abc");
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}

	public ResultSet returnValuesFromDB(String sql)
	{
		try
		{
			
			st=connectDB().createStatement();
			rs=st.executeQuery(sql);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rs;
		
	}
	public void updateQuery(String sql)
	{
		try
		{
			st=connectDB().createStatement();
			st.executeUpdate(sql);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
