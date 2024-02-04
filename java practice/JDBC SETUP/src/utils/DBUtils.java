package utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	private static Connection cn;
	//add a static method to ret DB Connection;
	
	public static Connection openConnection() throws ClassNotFoundException, SQLException {
		
		//1. optional step load jdbc driver
		Class.forName("com.mysql.cj.jdbc.Driver"); // jdbc driver fully qualified name
		
		//2. stablish connection with db
		
	    String dbURL = "jdbc:mysql://localhost:3306/advjava?useSSL=false&allowPublicKeyRetrieval=true";
	    
	    return DriverManager.getConnection(dbURL, "root", "root");
		
		
	}
	
	

}
