package jdbcDemo;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class Driver {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		//1.Get a Connection to database
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/complex_hotel_db","root","root");
		
		//2.Create a Statement
			
			Statement st=(Statement) con.createStatement();
		//3.Execute SQL query
			
			ResultSet rs=st.executeQuery("SELECT * FROM hotel_info");
		//4.Process ResultSet
			while (rs.next())
			{
				System.out.println(rs.getInt(1)+","+rs.getString("H_NAME")+","+rs.getString(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
