package task19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Vo Van Minh
 * @version 1.0
 * @created 29-Aug-2016 9:22:37 AM
 */
public class Product {

	private String name;
	private double price;

	public Product() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	/*
	 * Get a product. Input: user input from keyboard. Output: a Product.
	 */
	public Product getProduct() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter name product: ");
		String name = input.readLine();
		System.out.println("Enter price product: ");
		double price = Double.parseDouble(input.readLine());

		Product product = new Product(name, price);
		return product;
	}

	public void finalize() throws Throwable {

	}

	// to print a product information.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "\t" + price;
	}
}