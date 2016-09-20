package stream;

/**
 * @author vovanminh
 * @version 1.0
 * @created Sep 19, 2016
 */
public class Employee {
	String name;
	int age;
	float salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, float salary) {
		super();
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	// to print employee info.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + name + ", " + age + ", " + salary + "]";
	}

}
