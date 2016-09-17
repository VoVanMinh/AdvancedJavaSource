package transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @to demo Transaction
 * @author vovanminh
 * @version 1.0
 * @created Sep 18, 2016
 */
public class Main {
	public static void main(String[] args) {

		try {
			System.out.println("-----Transaction 1");
			doTransaction1();
		} catch (Exception e) {
			System.out.println("-----Error transaction 1");
			System.out.println(e.getMessage());
		}

		try {
			System.out.println("-----Transaction 2");
			doTransaction2();
		} catch (Exception e) {
			System.out.println("-----Error transaction 2");
			System.out.println(e.getMessage());
		}

		try {
			System.out.println("-----Transaction 3");
			doTransaction3();
		} catch (Exception e) {
			System.out.println("-----Error transaction 3");
			System.out.println(e.getMessage());
		}

	}

	/**
	 * @to demo transaction 1.
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	static void doTransaction1() throws SQLException, ClassNotFoundException {
		DatabaseConect dbconnect = new DatabaseConect();
		Connection conn = dbconnect.connect();
		conn.setAutoCommit(false);

		// insert a product
		Product product = new Product("Strawberry Cookies", 45000.0, 50, "strawberrycookies.jpg", 4, new Date(), 1);
		Date uDate = new Date();
		@SuppressWarnings("deprecation")
		java.sql.Date sDate = new java.sql.Date(uDate.getYear(), uDate.getMonth(), uDate.getDay());

		String sql = "INSERT INTO product VALUES (NULL, ?, ?, ?, ?, ?, ?, ?);";
		PreparedStatement statement = conn.prepareStatement(sql);

		statement.setString(1, product.getName());
		statement.setDouble(2, product.getPrice());
		statement.setInt(3, product.getAmount());
		statement.setString(4, product.getImage());
		statement.setInt(5, product.categoryId);
		statement.setDate(6, sDate);
		statement.setInt(7, product.getOnSell());

		statement.execute();

		// update a product
		sql = "UPDATE product SET price=?, amount=? WHERE id=?";
		statement = conn.prepareStatement(sql);

		statement.setDouble(1, 6000);
		statement.setInt(2, 55);
		statement.setInt(3, 1);

		statement.execute();

		// delete a product
		sql = "DELETE FROM product WHERE id = 19";
		statement = conn.prepareStatement(sql);

		statement.execute();

		conn.commit();
		conn.close();
	}

	/**
	 * @to demo transaction 2.
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	static void doTransaction2() throws SQLException, ClassNotFoundException {
		DatabaseConect dbconnect = new DatabaseConect();
		Connection conn = dbconnect.connect();
		conn.setAutoCommit(false);

		// insert a product
		String name = "VoVanMinh ";
		for (int i = 0; i < 4; i++) {
			name += name;
		}
		Product product = new Product(name, 45000.0, 50, "strawberrycookies.jpg", 4, new Date(), 1);
		Date uDate = new Date();
		@SuppressWarnings("deprecation")
		java.sql.Date sDate = new java.sql.Date(uDate.getYear(), uDate.getMonth(), uDate.getDay());

		String sql = "INSERT INTO product VALUES (NULL, ?, ?, ?, ?, ?, ?, ?);";
		PreparedStatement statement = conn.prepareStatement(sql);

		statement.setString(1, product.getName());
		statement.setDouble(2, product.getPrice());
		statement.setInt(3, product.getAmount());
		statement.setString(4, product.getImage());
		statement.setInt(5, product.categoryId);
		statement.setDate(6, sDate);
		statement.setInt(7, product.getOnSell());

		statement.execute();

		// update a product
		sql = "UPDATE product SET price=?, amount=? WHERE id=?";
		statement = conn.prepareStatement(sql);

		statement.setDouble(1, 125000);
		statement.setInt(2, 45);
		statement.setInt(3, 13);

		statement.execute();

		// delete a product
		sql = "DELETE FROM product WHERE id = 23";
		statement = conn.prepareStatement(sql);

		statement.execute();

		conn.commit();
		conn.close();
	}

	/**
	 * @to demo transaction 1.
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 * @throws ParseException
	 */
	static void doTransaction3() throws SQLException, ClassNotFoundException, ParseException {
		DatabaseConect dbconnect = new DatabaseConect();
		Connection conn = dbconnect.connect();
		conn.setAutoCommit(false);

		// insert a product
		String cDate = "10-09-2016";
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		java.sql.Date sDate = new java.sql.Date(format.parse(cDate).getTime());

		Product product = new Product("Strawberry Cookies", 45000.0, 50, "strawberrycookies.jpg", 4, sDate, 0);

		String sql = "INSERT INTO product VALUES (NULL, ?, ?, ?, ?, ?, ?, ?);";
		PreparedStatement statement = conn.prepareStatement(sql);

		statement.setString(1, product.getName());
		statement.setDouble(2, product.getPrice());
		statement.setInt(3, product.getAmount());
		statement.setString(4, product.getImage());
		statement.setInt(5, product.categoryId);
		statement.setDate(6, sDate);
		statement.setInt(7, product.getOnSell());

		statement.execute();

		// delete a product
		sql = "DELETE FROM product WHERE id = 10";
		statement = conn.prepareStatement(sql);

		statement.execute();

		// update a product
		sql = "UPDATE product SET price=?, amount=? WHERE id=?";
		statement = conn.prepareStatement(sql);

		statement.setDouble(1, 50000);
		statement.setInt(2, 10);
		statement.setInt(3, 10);

		statement.execute();

		conn.commit();
		conn.close();
	}

}
