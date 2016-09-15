package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 15, 2016
 */
public class Department {
	String id;
	String name;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * to print department info.
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + id + ", " + name + "]";
	}

	/**
	 * @to get a Department from keyboard
	 * @return Department
	 * @throws IOException
	 */
	public static Department getDeapartment() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("-----Input a department-----");
		System.out.println("Enter id: ");
		String id = input.readLine();
		System.out.println("Enter name: ");
		String name = input.readLine();

		Department de = new Department(id, name);
		return de;
	}
}
