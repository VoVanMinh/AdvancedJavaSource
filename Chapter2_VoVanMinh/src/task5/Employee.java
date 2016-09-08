package task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 8, 2016
 */
public class Employee implements Comparable<Employee> {
	String name;
	int age;
	double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// to compare employees by salary.
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return Double.compare(o.salary, this.salary);
	}

	// to print employee info.
	@Override
	public String toString() {
		return "[" + name + ", " + age + ", " + salary + "]";
	}
	//to get a employee from keyboard.
	public static Employee getEmployee() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\tName: ");
		String name = input.readLine();
		System.out.print("\tAge: ");
		int age = Integer.parseInt(input.readLine());
		System.out.print("\tSalary: ");
		double salary = Double.parseDouble(input.readLine());
		return new Employee(name, age, salary);
	}
}
