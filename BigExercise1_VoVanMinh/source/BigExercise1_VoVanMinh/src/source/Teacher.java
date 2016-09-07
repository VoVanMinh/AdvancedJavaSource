package source;

import java.util.ArrayList;

/**
 * @author vovanminh
 * @version 1.0
 * @created 06-Sep-2016 6:40:14 PM
 */
public class Teacher extends Person {

	public ArrayList<String> listTeach = new ArrayList<String>();

	public Teacher() {

	}

	public Teacher(String name, String birthDay, String phone, String email) {
		super(name, birthDay, phone, email);
		// TODO Auto-generated constructor stub
	}

	// to get a Teacher from a Person.
	static Teacher getTeacher(Person p) {
		return new Teacher(p.getName(), p.getBirthDay(), p.getEmail(), p.getPhone());

	}

	// to print a Teacher.
	public void printTeacher() {
		super.printPerson();
		System.out.println("Teach: " + listTeach.toString());
	}

}