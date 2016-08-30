package task19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Vo Van Minh
 * @version 1.0
 * @created 29-Aug-2016 9:22:36 AM
 */
public class OrderDetail {

	private int quantity;
	public Product m_Product;

	public OrderDetail() {

	}

	public OrderDetail(int quantity, Product m_Product) {
		super();
		this.quantity = quantity;
		this.m_Product = m_Product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getM_Product() {
		return m_Product;
	}

	public void setM_Product(Product m_Product) {
		this.m_Product = m_Product;
	}

	public void finalize() throws Throwable {

	}

	/*
	 * Get a order. Input: a product. Output: a Order detail.
	 */
	public OrderDetail getOrderDetail(Product product) throws IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter quantity: ");
		int quantity = Integer.parseInt(input.readLine());

		OrderDetail ort = new OrderDetail(quantity, product);
		return ort;
	}

	// to calculate money of a product.
	public double calLineTotal() {
		return quantity * m_Product.getPrice();
	}

	// to print a order detail information.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return m_Product.toString() + "\t" + quantity;
	}
}