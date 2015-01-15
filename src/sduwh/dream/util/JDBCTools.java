package sduwh.dream.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCTools {

	public static Connection getConnection() throws Exception {
	
		String user = "root";
		String password ="";
		String jdbcUrl = "jdbc:mysql://localhost:3306/gwap";
		String driveClass="com.mysql.jdbc.Driver";
		
	
		Class.forName(driveClass);

		
		Connection connection = DriverManager.getConnection(jdbcUrl, user,
				password);
		return connection;
	}


	public static void releaseDB(ResultSet resultSet, Statement statement,
			Connection connection) {

		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
