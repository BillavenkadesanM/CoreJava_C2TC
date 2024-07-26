import java.sql.Connection;
import java.sql.DriverManager;
import	java.sql.*;
public class _connection {
	public static Connection getConnection() throws SQLException

	{//establish	the	connection
		String	url="jdbc:mysql://localhost:3306/project";
		String	userName="root";
		String	password="132004@venkat";
		Connection	con=DriverManager.getConnection(url,userName,password);
		return	con;
	}
}
