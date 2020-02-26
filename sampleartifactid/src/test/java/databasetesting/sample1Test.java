package databasetesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import net.bytebuddy.dynamic.ClassFileLocator;

public class sample1Test {
  @Test
  public void f() throws ClassNotFoundException, SQLException {
	 String dburl="jdbc:mysql://localhost:3306/sample";
	 String username="root";
	 String password ="venu";
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection conn=DriverManager.getConnection(dburl,username,password);
	 Statement st=conn.createStatement();
			 ResultSet rs =st.executeQuery("select * from employee");
			 while(rs.next()){  
		      System.out.println(rs.getString("ename"));    
		      System.out.println(rs.getInt("age"));
			  conn.close();
	 
	 
	
  }
}
}