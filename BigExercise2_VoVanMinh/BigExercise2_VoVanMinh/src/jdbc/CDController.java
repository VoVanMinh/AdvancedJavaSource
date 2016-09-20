package jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 19, 2016
 */
public class CDController {
	final String[] CDFIELD = { "id", "name", "singer", "numberSongs", "price" };
	DatabaseConect dbconnect = new DatabaseConect();
	public List<CD> list = new ArrayList<>();

	/**
	 * @to get all CD from database to list.
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public void getCDList() throws SQLException, ClassNotFoundException {
		list.clear();
		Connection conn = dbconnect.connect();
		String sql = "SELECT * FROM cd";

		Statement statement = conn.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			CD cd = new CD();
			cd.setId(resultSet.getInt(CDFIELD[0]));
			cd.setName(resultSet.getString(CDFIELD[1]));
			cd.setSinger(resultSet.getString(CDFIELD[2]));
			cd.setNumberSongs(resultSet.getInt(CDFIELD[3]));
			cd.setPrice(resultSet.getDouble(CDFIELD[4]));

			list.add(cd);
		}
		conn.close();
	}

	// to print cd list
	public void printList() {
		System.out.println("-----CD List-----");
		if (list.size() == 0)
			System.out.println("List is empty.");
		else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println((i + 1) + ": " + list.get(i));
			}
		}
	}

	/**
	 * @to get CD from user's chosen
	 * @param list
	 * @return CD
	 */
	public CD chooseCD() {
		if (list.size() == 0)
			return null;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int cid = 0;
		while (cid < 1 || cid > list.size()) {
			System.out.println("Enter cd from 1->" + list.size() + ": ");
			cid = input.nextInt();
		}
		return list.get(cid - 1);
	}

	/**
	 * @to insert a CD to database.
	 * @param cd
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public void insertCD(CD cd) throws SQLException, ClassNotFoundException {
		Connection conn = dbconnect.connect();
		String sql = "INSERT INTO cd VALUES (NULL, ?, ?, ?, ?);";
		PreparedStatement statement = conn.prepareStatement(sql);

		statement.setString(1, cd.getName());
		statement.setString(2, cd.getSinger());
		statement.setInt(3, cd.getNumberSongs());
		statement.setDouble(4, cd.getPrice());

		statement.execute();
		conn.close();
		System.out.println("---Inserted.");
	}

	/**
	 * @to search CD by name
	 * @param name
	 * @return list
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void searchCDByName(String name) throws ClassNotFoundException, SQLException {
		list.clear();
		Connection conn = dbconnect.connect();
		String sql = "SELECT * FROM cd WHERE name LIKE '%" + name + "%'";
		Statement statement = conn.createStatement();

		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			CD cd = new CD();

			cd.setId(resultSet.getInt(CDFIELD[0]));
			cd.setName(resultSet.getString(CDFIELD[1]));
			cd.setSinger(resultSet.getString(CDFIELD[2]));
			cd.setNumberSongs(resultSet.getInt(CDFIELD[3]));
			cd.setPrice(resultSet.getDouble(CDFIELD[4]));

			list.add(cd);
		}
		conn.close();
	}

	/**
	 * @to search CD by price
	 * @param price1, price2
	 * @return list
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void searchCDByPrice(double price1, double price2) throws ClassNotFoundException, SQLException {
		list.clear();
		Connection conn = dbconnect.connect();
		String sql = "SELECT * FROM cd WHERE price BETWEEN '" + price1 + "%' AND '" + price2 + "%'";
		Statement statement = conn.createStatement();

		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			CD cd = new CD();

			cd.setId(resultSet.getInt(CDFIELD[0]));
			cd.setName(resultSet.getString(CDFIELD[1]));
			cd.setSinger(resultSet.getString(CDFIELD[2]));
			cd.setNumberSongs(resultSet.getInt(CDFIELD[3]));
			cd.setPrice(resultSet.getDouble(CDFIELD[4]));

			list.add(cd);
		}
		conn.close();
	}

	/**
	 * @to set numberSongs and price for a CD
	 * @param cd
	 * @return CD
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public CD preUpdateCD(CD cd) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("-----Update CD-----");
		int numberSongs = 0;
		while (numberSongs < 1) {
			System.out.println("Enter set number of songs >= 1: ");
			numberSongs = Integer.parseInt(input.readLine());
		}
		double price = 0;
		while (price <= 0) {
			System.out.println("Enter set price > 0: ");
			price = Double.parseDouble(input.readLine());
		}
		cd.setNumberSongs(numberSongs);
		cd.setPrice(price);
		return cd;
	}

	/**
	 * @to update price and number of songs of a CD
	 * @param cd
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void updateCD(CD cd) throws ClassNotFoundException, SQLException {
		Connection conn = dbconnect.connect();
		String sql = "UPDATE cd SET numberSongs=?,price=? WHERE id=?";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, cd.getNumberSongs());
		statement.setDouble(2, cd.getPrice());
		statement.setInt(3, cd.getId());

		statement.execute();
		conn.close();
		System.out.println("---Updated");
	}

	/**
	 * @to delete a CD
	 * @param cd
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void deleteCD(CD cd) throws ClassNotFoundException, SQLException {
		Connection conn = dbconnect.connect();
		String sql = "DELETE FROM cd WHERE id = '" + cd.getId() + "'";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.execute();

		conn.close();
		System.out.println("---Deleted");
	}
}
