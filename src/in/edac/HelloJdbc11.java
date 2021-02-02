package in.edac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HelloJdbc11 {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://192.168.64.5:3306/edac";
	public static final String DB_USER = "mysql";
	public static final String DB_PASSWORD = "mysql";
	
	public static void main(String[] args) throws Exception {
		
		Connection con = null;
		try {
			Class.forName(DB_DRIVER);
			
			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			
			String sql = "SELECT * FROM USER";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("ID");
				String username = rs.getString("USERNAME");
				
				System.out.println(id + " "+ username);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		} 
		
	}
}
