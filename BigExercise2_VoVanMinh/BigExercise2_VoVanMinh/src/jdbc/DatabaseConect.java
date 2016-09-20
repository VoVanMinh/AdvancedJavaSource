package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 16, 2016
 */
public class DatabaseConect {
	static final String JDBC_URL = "jdbc:mysql://localhost:3306/cdstore?useUniCode=true&characterEncoding=utf8&serverTimezone=Asia/Ho_Chi_Minh";
	static final String JDBC_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	static final String JDBC_USERNAME = "root";
	static final String JDBC_PASSWORD = "";
	
	/**
	 * @to connect to Mysql
	 * @return connection
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public Connection connect() throws ClassNotFoundException, SQLException {
		Class.forName(JDBC_DRIVER_CLASS);
		Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
		return conn;
	}
}
