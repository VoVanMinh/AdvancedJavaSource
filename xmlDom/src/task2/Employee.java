package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 15, 2016
 */
public class Employee {
	String id;
	String name;
	String sex;
	String birthday;
	float salary;
	String address;
	String department;

	public Employee(String id, String name, String sex, String birthday, float salary, String address,
			String department) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
		this.salary = salary;
		this.address = address;
		this.department = department;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	// to print employee info.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + id + ", " + name + ", " + sex + ", " + birthday + ", " + salary + ", " + address + ", "
				+ department + "]";
	}
	
	/**
	 * @to get a employee from keyboard
	 * @return Employee
	 * @throws IOException 
	 */
	public static Employee getEmployee() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("-----Input a employee-----");
		System.out.println("Enter id: ");
		String id = input.readLine();
		System.out.println("Enter name: ");
		String name = input.readLine();
		System.out.println("Enter sex: ");
		String sex = input.readLine();
		System.out.println("Enter birthday dd/MM/yyyy: ");
		String birthday = input.readLine();
		System.out.println("Enter salary: ");
		float salary = Float.parseFloat(input.readLine());
		System.out.println("Enter address: ");
		String address = input.readLine();
		System.out.println("Enter department(id): ");
		String department = input.readLine();
		
		Employee emp = new Employee(id, name, sex, birthday, salary, address, department);
		return emp;
	}
}
