package product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import account.DatabaseConect;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 17, 2016
 */
public class ProductController {
	final String[] PRODUCT = { "id", "name", "price", "amount", "categoryid" };
	DatabaseConect dbconnect = new DatabaseConect();
	public List<Product> list = new ArrayList<>();

	/**
	 * @to get categoryID from keyboard
	 * @param list
	 * @return int type
	 */
	public Product chooseProduct() {
		if (list.size() == 0)
			return null;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int cid = 0;
		while (cid < 1 || cid > list.size()) {
			System.out.println("Enter product id 1->" + list.size() + ": ");
			cid = input.nextInt();
		}
		return list.get(cid - 1);
	}

	/**
	 * @to get all product from database to list.
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public void getProductList() throws SQLException, ClassNotFoundException {
		list.clear();
		Connection conn = dbconnect.connect();
		String sql = "SELECT * FROM product";

		Statement statement = conn.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			Product product = new Product();
			product.setId(resultSet.getInt(PRODUCT[0]));
			product.setName(resultSet.getString(PRODUCT[1]));
			product.setPrice(resultSet.getFloat(PRODUCT[2]));
			product.setAmount(resultSet.getInt(PRODUCT[3]));
			product.setCategoryID(resultSet.getInt(PRODUCT[4]));

			list.add(product);
		}
		conn.close();
	}

	// to print product list
	public void printList() {
		System.out.println("-----Product List-----");
		if (list.size() == 0)
			System.out.println("List is empty.");
		else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println((i+1) +": " +list.get(i));
			}
		}
	}

	/**
	 * @to insert a product to database.
	 * @param product
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public void insertProduct(Product product) throws SQLException, ClassNotFoundException {
		Connection conn = dbconnect.connect();
		String sql = "INSERT INTO product VALUES (NULL, ?, ?, ?, ?);";
		PreparedStatement statement = conn.prepareStatement(sql);

		statement.setString(1, product.getName());
		statement.setFloat(2, product.getPrice());
		statement.setInt(3, product.getAmount());
		statement.setInt(4, product.getCategoryID());

		statement.execute();
		conn.close();
		System.out.println("---Inserted.");
		list.add(product);
	}

	/**
	 * @to search product by name
	 * @param name
	 * @return list
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void searchProduct(String name) throws ClassNotFoundException, SQLException {
		list.clear();
		Connection conn = dbconnect.connect();
		String sql = "SELECT * FROM product WHERE name LIKE '%" + name + "%'";
		Statement statement = conn.createStatement();

		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			Product product = new Product();
			product.setId(resultSet.getInt(PRODUCT[0]));
			product.setName(resultSet.getString(PRODUCT[1]));
			product.setPrice(resultSet.getFloat(PRODUCT[2]));
			product.setAmount(resultSet.getInt(PRODUCT[3]));
			product.setCategoryID(resultSet.getInt(PRODUCT[4]));

			list.add(product);
		}
		conn.close();
	}

	/**
	 * @to update price and amount of a product
	 * @param product
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void updateProduct(Product product) throws ClassNotFoundException, SQLException {
		Connection conn = dbconnect.connect();
		String sql = "UPDATE product SET price=?,amount=? WHERE id=?";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setFloat(1, product.getPrice());
		statement.setInt(2, product.getAmount());
		statement.setInt(3, product.getId());

		statement.execute();
		conn.close();
		System.out.println("---Updated");
	}

	/**
	 * @to delete a product
	 * @param product
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void deleteProduct(Product product) throws ClassNotFoundException, SQLException {
		Connection conn = dbconnect.connect();
		String sql = "DELETE FROM product WHERE id = '" + product.getId() + "'";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.execute();

		conn.close();
		System.out.println("---Deleted");
	}

}
