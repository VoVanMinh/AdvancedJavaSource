package task19;

import java.util.ArrayList;

/**
 * @author Vo Van Minh
 * @version 1.0
 * @created 29-Aug-2016 9:22:36 AM
 */
public class ProductManager {
	public final static String[] NAME = { "Laptop", "Phone", "Book", "Mouse", "Desktop", "SD card", "SIM", "Keyboard",
			"Battery", "Modem" };
	public final static double[] PRICE = { 1000, 500, 100, 30, 400, 50, 3, 10, 80, 70 };

	ArrayList<Product> listProduct = new ArrayList<Product>();

	// to add products into list.
	public void addListProduct() {
		for (int i = 0; i < NAME.length; i++) {
			Product product = new Product(NAME[i], PRICE[i]);
			listProduct.add(product);
		}
	}

	// to print product list.
	public void printList() {
		System.out.println("Product name \t Price");
		for (int i = 0; i < listProduct.size(); i++) {
			System.out.println((i + 1) + ". " + listProduct.get(i).toString());
		}
	}
}
