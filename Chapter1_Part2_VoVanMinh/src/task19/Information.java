package task19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Vo Van Minh
 * @version 1.0
 * @created 29-Aug-2016 9:22:36 AM
 */
public class Information {

	protected String address;
	protected String email;
	protected String identityCardNumber;
	protected String name;
	protected String phoneNumber;

	public Information() {

	}

	public Information(String address, String email, String identityCardNumber, String name, String phoneNumber) {
		super();
		this.address = address;
		this.email = email;
		this.identityCardNumber = identityCardNumber;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	/*
	 * Get a information. Input: user input from keyboard. Output: a
	 * Information.
	 */
	public Information getInfomation() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter name: ");
		String name = input.readLine();
		System.out.println("Enter address: ");
		String address = input.readLine();
		System.out.println("Enter email: ");
		String email = input.readLine();
		System.out.println("Enter ID: ");
		String id = input.readLine();
		System.out.println("Enter phone: ");
		String phone = input.readLine();

		Information info = new Information(address, email, id, name, phone);
		return info;
	}

	public void finalize() throws Throwable {

	}

	// to print a Information information.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "\t" + address + "\t" + email + "\t" + identityCardNumber + "\t" + phoneNumber;
	}

}