package account;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 16, 2016
 */
public class UserController {
	final String[] USER = { "id", "username", "password" };
	DatabaseConect dbconnect = new DatabaseConect();

	/**
	 * @to get User from database if it exist
	 * @param username
	 * @param password
	 * @return User
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public User loginUser(User u) throws ClassNotFoundException, SQLException {
		User user = null;

		Connection conn = dbconnect.connect();
		java.sql.Statement statement = conn.createStatement();
		String sql = "SELECT * FROM user WHERE username like '" + u.getUsername() + "' and password like '" + u.getPassword() + "'";
		
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			user = new User();
			user.setId(resultSet.getInt(USER[0]));
			user.setUsername(USER[1]);
			user.setPassword(USER[2]);
			break;
		}
		conn.close();
		return user;
	}
	
	public void insertUser(User user) throws SQLException, ClassNotFoundException {
		
		Connection conn = dbconnect.connect();
		String sql = "INSERT INTO user (username, password) VALUES ('"+user.getUsername()+"', '"+user.getPassword()+"')";
		
		java.sql.PreparedStatement statement = conn.prepareStatement(sql);
		statement.execute();
		
		System.out.println("---Inserted");
	}
}
