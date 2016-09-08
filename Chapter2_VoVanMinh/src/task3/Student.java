package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author _vovanminh
 * @version 1.0
 * @created Sep 7, 2016
 */

public class Student {
	String name;
	int age;
	String placeOfBirth;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, String placeOfBirth) {
		this.name = name;
		this.age = age;
		this.placeOfBirth = placeOfBirth;
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

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	/**
	 * Input student info. return a Student.
	 */

	public static Student getStudent() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\tName: ");
		String name = input.readLine();
		System.out.print("\tAge: ");
		int age = Integer.parseInt(input.readLine());
		System.out.print("\tPlace Of Birth: ");
		String placeOfBirth = input.readLine();
		return new Student(name, age, placeOfBirth);
	}
	//to print a student.
	@Override
	public String toString() {
		return "[" +name + ", " +age + ", " +placeOfBirth +"]";
	}

}
