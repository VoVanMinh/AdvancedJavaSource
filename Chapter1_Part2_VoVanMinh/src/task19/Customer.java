package task19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Vo Van Minh
 * @version 1.0
 * @created 29-Aug-2016 9:22:36 AM
 */
public class Customer extends Information {

	private String customerID;
	public Order m_Order;

	public Customer() {

	}

	public Customer(String address, String email, String identityCardNumber, String name, String phoneNumber,
			String customerID) {
		super(address, email, identityCardNumber, name, phoneNumber);
		this.setCustomerID(customerID);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/*
	 * Get a customer. Input: a Information. Output: a Customer.
	 */
	public Customer getCustomer(Information info) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter customer id: ");
		String customerID = input.readLine();

		Customer customer = new Customer(info.address, info.email, info.identityCardNumber, info.name, info.phoneNumber,
				customerID);
		return customer;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	// to print Customer information.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\t" + customerID;
	}
}