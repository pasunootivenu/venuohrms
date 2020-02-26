package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import net.bytebuddy.dynamic.ClassFileLocator;

public class database1NewTest {
  @Test
  public void f() throws Exception {
	  
	  String  dburl="jdbc:mysql://localhost:3306/sample";
	  String username ="root";
	  String  password="venu";

	  Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection con = DriverManager.getConnection(dburl,username,password);
	  Statement st=con.createStatement();
	  ResultSet rs = st.executeQuery("select * from employee");
	  while (rs.next()) {
		  
		   System.out.println(rs.getString("ename"));
		   System.out.println(rs.getInt("age"));
	  
	 
	  }  
}
}