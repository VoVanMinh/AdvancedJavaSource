package product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 17, 2016
 */
public class Product {
	int id;
	String name;
	float price;
	int amount;
	int categoryID;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, float price, int amount, int categoryID) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.categoryID = categoryID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	/**
	 * @to get a product from keyboard
	 * @return Product
	 * @throws IOException
	 */
	public static Product getProduct() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("-----Input product-----");
		System.out.println("Name: ");
		String name = input.readLine();
		System.out.println("Price: ");
		float price = Float.parseFloat(input.readLine());
		System.out.println("Amount: ");
		int amount = Integer.parseInt(input.readLine());
		Product product = new Product(0, name, price, amount, 0);
		return product;
	}

	// to print product info
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + id + ", " + name + ", " + price + ", " + amount + ", " + categoryID + "]";
	}
}
