package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 15, 2016
 */
public class Contact {
	String name;
	String phone;

	public Contact(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @to get a contact from keyboard
	 * @return Contact
	 * @throws IOException 
	 */
	public static Contact getContact() throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("-----Input a contact-----");
		System.out.println("Enter name: ");
		String name = input.readLine();
		System.out.println("Enter phone: ");
		String phone = input.readLine();
		
		Contact contact = new Contact(name, phone);
		return contact;
	}

	/**
	 * @to print contact info
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + name + ", " + phone + "]";
	}

}
