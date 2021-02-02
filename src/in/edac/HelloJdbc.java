package in.edac;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * R1. Database Server :: MySQL :: SCHEMA / TABLE 
 * 
 * @author research
 * ASSIGNMENT. 
 * 1. CREAETE SCHEMA PROGRAMMATICALLY
 * 2. CREATE TABLE PROGMATICALLY
 * 
 * Fully Classified Name.
 * Dynamic Loading.
 * 
 * HelloJdbc
 * in.edac.HelloJdbc
 */
public class HelloJdbc {
	
	public static void main(String[] args) {
		try {
			// Dynamic Loading!! the class Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// String url = "jdbc:mysql://localhost:3306/edac"
			String url = "jdbc:mysql://192.168.64.5:3306/edac";
			String user = "mysql";
			String password = "mysql";
			
			// Open Connection
			Connection con = DriverManager.getConnection(url, user, password);

			System.out.println("Horray!!! DB Connected!!");
			
			// Close Connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
