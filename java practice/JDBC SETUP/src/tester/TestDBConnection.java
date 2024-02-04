package tester;
import java.sql.*;
import static utils.DBUtils.openConnection;

public class TestDBConnection {

	public static void main(String[] args) {
		
		try(Connection connection = openConnection()){  // open connection returns the connection object
			
			System.out.println("connected to DB"+connection); // Connection class toString() is called
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
