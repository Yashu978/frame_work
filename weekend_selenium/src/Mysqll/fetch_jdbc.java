package Mysqll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class fetch_jdbc 
{
	@Test
	public void jd_fetch() throws SQLException
	{
		String url="jdbc/mysql://localhost:3306/test";
		String un="root";
		String pwd="root";
		Connection connection = DriverManager.getConnection(url, un, pwd);
		Statement stat = connection.createStatement();
		ResultSet result = stat.executeQuery("select * from data");
		while(result.next())
		{
		String username=result.getString(1);
		String password=result.getString(2);
		System.out.println(username+"  "+password);
		}

	}

}
