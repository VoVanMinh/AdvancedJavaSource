package task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 14, 2016
 */
@SuppressWarnings("serial")
public class Employee implements Serializable {
	String name;
	String address;
	float salary;

	public Employee(String name, String address, float salary) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	/**
	 * @to get a employee from keyboard.
	 * @return Employee
	 * @throws IOException
	 */
	public static Employee getEmployee() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("-----Input a Employee-----");
		System.out.println("Enter name: ");
		String name = input.readLine();
		System.out.println("Enter address: ");
		String address = input.readLine();
		System.out.println("Enter salary: ");
		float salary = Float.parseFloat(input.readLine());

		Employee emp = new Employee(name, address, salary);
		return emp;
	}

	// to print a student
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + name + ", " + address + ", " + salary + "]";
	}

}
