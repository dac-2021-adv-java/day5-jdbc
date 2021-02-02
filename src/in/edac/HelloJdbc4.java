package in.edac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelloJdbc4 {
	
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	// public static final String url = "jdbc:mysql://localhost:3306/edac"
	public static final String DB_URL = "jdbc:mysql://192.168.64.5:3306/edac";
	public static final String DB_USER = "mysql";
	public static final String DB_PASSWORD = "mysql";
	
	public static void main(String[] args) throws Exception {
		
		Connection con = null;
		
		try {
			// Dynamic Loading!! the class Driver
			Class.forName(DB_DRIVER);
			
			// Open Connection
			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

			System.out.println("Horray!!! DB Connected!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close Connection
			con.close();
		}
		
	}

}
