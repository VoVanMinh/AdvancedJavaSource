package account;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 16, 2016
 */
public class User {
	int id;
	String username;
	String password;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @to get User from keyboard
	 * @return User
	 * @throws IOException
	 */
	public static User getUser() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter username: ");
		String username = input.readLine();
		System.out.println("Enter password: ");
		String password = input.readLine();

		User user = new User(username, password);
		return user;
	}

	// to print user info
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + id + ", " + username + ", " + password + "]";
	}
}
