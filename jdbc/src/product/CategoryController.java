package product;

import java.sql.Connection;
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
public class CategoryController {
	final String[] CATEGORY = { "id", "name", "description" };
	DatabaseConect dbconnect = new DatabaseConect();
	public List<Category> list = new ArrayList<>();

	/**
	 * @to get categoryID from keyboard
	 * @param list
	 * @return int type
	 */
	int getCategoryID() {
		if (list.size() == 0)
			return 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int cid = 0;
		while (cid < 1 || cid > list.size()) {
			System.out.println("Enter cateoryID 1->" + list.size() + ": ");
			cid = input.nextInt();
		}
		return cid;
	}

	/**
	 * @to get all category from database to list.
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public void getCategoryList() throws SQLException, ClassNotFoundException {

		Connection conn = dbconnect.connect();
		String sql = "SELECT * FROM category";

		Statement statement = conn.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			Category category = new Category();
			category.setId(resultSet.getInt(CATEGORY[0]));
			category.setName(resultSet.getString(CATEGORY[1]));
			category.setDescription(resultSet.getString(CATEGORY[2]));
			list.add(category);
		}
	}

	// to print category list
	public void printList() {
		System.out.println("-----Category List-----");
		if (list.size() == 0)
			System.out.println("List is empty.");
		else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println((i+1) +": " +list.get(i));
			}
		}
	}
}
